package com.Restaurant.Restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class RestaurantDao {
	
	private static List<Restaurant> resList =new ArrayList<>();
	
	
	//Temp data till database connection
	static {
		resList.add(new Restaurant("Anjapar","Indian", 1, 3.9, 50));
		resList.add(new Restaurant("Olive Garden","Italian",2, 3.9, 70));
		resList.add(new Restaurant("Tia Juana","Mexican", 3, 4.2, 30));
		resList.add(new Restaurant("Panda Express","Chinese", 4, 3.9, 100));
	}
	
	
	/*static {
		resList.add(new Restaurant("Anjapar", 1, 3.9, 50,"Lawrence expy santaclara", 95051));//Indian
		resList.add(new Restaurant("Olive Garden",2, 3.9, 70," Great mall Dr Millipitas", 95035));//Italian
		resList.add(new Restaurant("Tia Juana", 3, 4.2, 30,"E Duan Ave Sunnyvale", 94085));//Mexican
		resList.add(new Restaurant("Panda Express", 4, 3.9, 100,"2980 E Capitol Expy #10 San Jose ", 95148));//Chinese
	}*/
	
	public List<Restaurant> findAllRestaurant(){
		return resList;
	}
	
	
	public  boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	public  boolean isInt(String str)  
	{  
	  try  
	  {  
	    Integer d = Integer.parseInt(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	public  boolean isLong(String str)  
	{  
	  try  
	  {  
	   Long d = Long.parseLong(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	
	 
	
	//Find by zip code
	public  List<Restaurant> findRestaurant(Long value) {
		List<Restaurant> resultList =new ArrayList<>();
		if(value>=9999) {
			for(Restaurant restaurants :resList) {
				if(restaurants.getLocation().getZipCode()==value) {
					resultList.add(restaurants);
				}
			}
		}
		return resultList;
	}
	
	//Find by ID or Price range
		 public List<Restaurant> findRestaurant(Integer value){
			 List<Restaurant> resultList =new ArrayList<>();
			 for(Restaurant restaurants :resList) {
				 if(restaurants.getRestaurantId()!=null&&restaurants.getRestaurantId()==value) {
					 resultList.add(restaurants);
				 }
				 else
					 if(restaurants.getPriceRange()==Integer.valueOf(value)) {
							resultList.add(restaurants);
						} 
			 }
			return resultList;
			 
		 }
			
		//Find by rating
		public List<Restaurant> findRestaurant(Double value) {
			List<Restaurant> resultList =new ArrayList<>();
				for(Restaurant restaurants :resList) {
					if(restaurants.getRating().equals(value)) {
					resultList.add(restaurants);
					}
				}
				
			
			return resultList;
		}
		
		
		//Find by type and name
		public List<Restaurant> findRestaurant(String value) {
			List<Restaurant> resultList =new ArrayList<>();
			for(Restaurant restaurants :resList) {
				if(restaurants.getType().toLowerCase().contains(value.toLowerCase())) {
					resultList.add(restaurants);
				}
				
				else
					if(restaurants.getName().toLowerCase().contains(value.toLowerCase())) {
						resultList.add(restaurants);
					}
			}
			return resultList;
		}
		
		//Add by id
		public Restaurant addRestaurant(Restaurant newRestaurant) {
			if(!resList.contains(newRestaurant)) {
			resList.add(newRestaurant);
			}
			return newRestaurant;
		}
		
		//Delete by id
		public Restaurant deleteRestaurant(int id) {
			Iterator<Restaurant> iterator =resList.iterator();
			while(iterator.hasNext()){
				Restaurant res=iterator.next();
				if(res.getRestaurantId()==id) {
					iterator.remove();
					return res;
				}
			}
			return null;
		}
		
		//Update by id
		public Restaurant updateRestaurant(int id) {
			return null;
		}
		
		

}
