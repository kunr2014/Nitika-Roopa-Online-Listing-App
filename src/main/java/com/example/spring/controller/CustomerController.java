package com.example.spring.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.bean.Customer;
import com.example.spring.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService CustomerService;  //Service which will do all data retrieval/manipulation work

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> CreateAccount(@PathVariable("id") long id) {
        System.out.println("Fetching User with password " + password);
        Customer customer = CustomerService.(id);
        if (customer.getCustomerUsername() == null && customer.getCustomerPassword() == null) {
            System.out.println("User with username " + username + " not found");
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/customer/Order", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> placeOrder(@PathVariable("id") long id) {
        
        
    }
	
	@RequestMapping(value = "/customer/Items", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> NavigateMenu(@PathVariable("") ) {
        
        
    }
	
	@RequestMapping(value = "/customer/Items", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> SelectItemFromTheMenu(@PathVariable("id") long id) {
        
        
    }
	
	@RequestMapping(value = "/customer/Order", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> ViewOrder(@PathVariable("id") long id) {
        
        
    }
	
	@RequestMapping(value = "/customer/Promotions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> PromotionsAndDiscounts(@PathVariable("id") long id) {
        
        
    }
	}

