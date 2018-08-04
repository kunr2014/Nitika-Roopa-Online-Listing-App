package com.Restaurant.Restaurant;

import org.springframework.stereotype.Controller;

@Controller

public class Location {
	
	private String Address;
	private Integer ZipCode;

	public Integer getZipCode() {
		return ZipCode;
	}

	public void setZipCode(Integer zipCode) {
		ZipCode = zipCode;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	

	@Override
	public String toString() {
		return "Location [Address=" + Address + ", ZipCode=" + ZipCode + "]";
	}

	public Location(String address, Integer zipCode) {
		Address = address;
		ZipCode = zipCode;
	}

	public Location() {
		
	}
	
	
	
	
	
	
	
	

}