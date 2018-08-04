package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring.bean.Customer;
import com.example.spring.service.customerServiceImpl;

public class RestaurantController {
	@Autowired
	private customerServiceImpl customerService;
	
	/**
	 * UserController
	 * 
	 */
	@RequestMapping(value = "/customer/orderId", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Customer> placeOrder() {
		return null;
	}

	@RequestMapping(value = "/customer/orderId", method = RequestMethod.GET)
	public ResponseEntity<Customer> reviewOrder(@PathVariable("id") Long customerId) {
		return null;
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Customer> createAccount(@RequestBody Customer customer) {
		return null;
	}

	@RequestMapping(value = "/customer/paymentId", method = RequestMethod.DELETE)
	public ResponseEntity<Customer> makePaayment(@PathVariable("id") Long customerId) {
		return null;
	}

}
