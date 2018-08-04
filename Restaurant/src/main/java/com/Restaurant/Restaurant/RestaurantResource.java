package com.Restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantResource {
	@Autowired
	private RestaurantDao resDaoService;
	
	@GetMapping(path="/restaurants")
	public List<Restaurant> findallRestaurants(){
		return resDaoService.findAllRestaurant();
	}
	
	
	@GetMapping(path="/restaurants/{value}")
	public List<Restaurant> findSelectedRestaurants(@PathVariable Double value){
		List<Restaurant> resultList=new ArrayList<Restaurant>();
		
		while(resDaoService.findRestaurant(value)==null) {
			resultList.add(resDaoService.findRestaurant(value));
		}
		
		return resultList;
	}
	
	/*@GetMapping(path="/restaurants/{value}")
	public List<Restaurant> findSelectedRestaurants(@PathVariable Integer value){
		List<Restaurant> resultList=new ArrayList<Restaurant>();
		
		while(resDaoService.findRestaurant(value)==null) {
			resultList.add(resDaoService.findRestaurant(value));
		}
		
		return resultList;
	}*/



	@DeleteMapping(path="/restaurants/{id}")
	public List<Restaurant> deleteRestaurants(@PathVariable Integer id){
		return null;
	}	
	
	
	

	
}
