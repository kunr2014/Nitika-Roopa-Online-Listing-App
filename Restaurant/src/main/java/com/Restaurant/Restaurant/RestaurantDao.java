package com.Restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RestaurantDao {
	
	private static List<Restaurant> resList =new ArrayList<>();
	
	//Temp data till database connection
	
	static {
		resList.add(new Restaurant("Anjapar", 1, 3.9, 50));//Indian
		resList.add(new Restaurant("Olive Garden",2, 3.9, 70));//Italian
		resList.add(new Restaurant("Tia Juana", 3, 4.2, 30));//Mexican
		resList.add(new Restaurant("Panda Express", 4, 3.9, 100));//Chinese
	}
	
	public List<Restaurant> findAllRestaurant(){
		return resList;
	}
	
	public Restaurant findRestaurant(String value) {

		if(Integer.parseInt(value)>=9999) {
			for(Restaurant restaurants :resList) {
				if(restaurants.getLocation().areaCode==Integer.valueOf(value)) {
					return restaurants;
				}
			}
		}
		return null;
	}
			
		
		public Restaurant findRestaurant(Double value) {
			if((value>=0) && (value>=5.0)) {
				for(Restaurant restaurants :resList) {
					if(restaurants.getRating()==value) {
					return restaurants;
					}
				}
				
			}
			return null;
		}
				
		public Restaurant findRestaurant(Integer value) {
					if(value>=0) {
						for(Restaurant restaurants :resList) {
							if(restaurants.getPriceRange()==Integer.valueOf(value)) {
								return restaurants;
							}
						}
					}
		
		
		return null;
		
	}

}
