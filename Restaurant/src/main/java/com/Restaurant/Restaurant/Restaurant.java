package com.Restaurant.Restaurant;

public class Restaurant {
	private String name;
	private Integer restaurantId;
	private Double rating;
	private Integer priceRange;
	
	public Restaurant() {
		
	}
	//Parametrized Constructor
	
	public Restaurant(String name, Integer restaurantId, double rating,	Integer priceRange) {
		
		this.name = name;
		this.restaurantId = restaurantId;
		this.rating = rating;
		this.priceRange = priceRange;
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
	
	

	

}
