package com.example.spring.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	private String customerUsername;
	private String customerPassword;
	

	@JsonCreator
	public Customer(@JsonProperty("customerUsername") String customerUsername, @JsonProperty("password") String customerPassword)
			 {
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		
	}


	public String getCustomerUsername() {
		return customerUsername;
	}


	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}


	public String getCustomerPassword() {
		return customerPassword;
	}


	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}


	@Override
	public String toString() {
		return "Customer [customerUsername=" + customerUsername + ", customerPassword=" + customerPassword + "]";
	}
	
}
