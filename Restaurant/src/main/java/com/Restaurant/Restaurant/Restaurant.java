package com.Restaurant.Restaurant;

import org.springframework.stereotype.Controller;

@Controller
public class Restaurant {
	private String name;
	private String type;
	private Integer restaurantId;
	private Double rating;
	private Integer priceRange;
	private Location location;
	
	public Restaurant() {
		
	}
	//Parametrized Constructor
	
	//public Restaurant(String name, Integer restaurantId, double rating,	Integer priceRange,String address,Integer zipcode) {
	public Restaurant(String name, String type,Integer restaurantId, double rating,	Integer priceRange) {
		this.name = name;
		this.type=type;
		this.restaurantId = restaurantId;
		this.rating = rating;
		this.priceRange = priceRange;
		/*this.location.setAddress(address);
		this.location.setZipCode(zipcode);*/
	}
	
	// ToString Method
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", restaurantId=" + restaurantId  +  ", rating=" + rating + ", priceRange=" + priceRange + "]";
	}
	
	
	//Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Integer getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(Integer priceRange) {
		this.priceRange = priceRange;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	

}
