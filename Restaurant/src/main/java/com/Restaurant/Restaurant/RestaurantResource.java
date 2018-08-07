package com.Restaurant.Restaurant;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



@RestController
@EnableAutoConfiguration
@ComponentScan
public class RestaurantResource {
	@Autowired
	private RestaurantDao resDaoService;
	
	//Find all 
	@GetMapping(path="/restaurants")
	public List<Restaurant> findallRestaurants(){
		return resDaoService.findAllRestaurant();
	}
	
	//Delete by id
	@DeleteMapping(path="/restaurants/{id}")
	public List<Restaurant> deleteRestaurants(@PathVariable Integer id){
		resDaoService.deleteRestaurant(id);
		return null;
	}	
	
	//Add new
	@PostMapping(path="//restaurants")
	public ResponseEntity<Object> addRestaurant(@RequestBody Restaurant restaurant){
        Restaurant newrestaurant=resDaoService.addRestaurant(restaurant);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newrestaurant.getRestaurantId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	
    //Find by anyValue
	@GetMapping(path="/restaurants/{value}")
	public List<Restaurant> findSelectedRestaurants(@PathVariable String value){
		
		if(resDaoService.isInt(value)){
		return resDaoService.findRestaurant(Integer.parseInt(value));
		}
		else
			if(resDaoService.isNumeric(value)) {
				return resDaoService.findRestaurant(Double.parseDouble(value));
			}
			else
				if(resDaoService.isLong(value)) {
					return resDaoService.findRestaurant(Long.parseLong(value));
				}
				else
					return resDaoService.findRestaurant(value);
	}
	
	
	//Update by id
	
	
	



	
	
	
	

	
}
