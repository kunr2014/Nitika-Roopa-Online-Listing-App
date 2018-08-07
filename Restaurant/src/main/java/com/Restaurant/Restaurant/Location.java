package com.Restaurant.Restaurant;

import org.springframework.stereotype.Controller;

@Controller

public class Location {
	
	private String Address;
	private Long ZipCode;
	

	public Long getZipCode() {
		return ZipCode;
	}

	public void setZipCode(Long zipCode) {
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

	public Location(String address, long i) {
		Address = address;
		ZipCode = i;
	}

	public Location() {
		
	}
	
	
	
	
	
	
	
	

}
