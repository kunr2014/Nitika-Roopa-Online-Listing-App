package com.example.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.dao.CustomerDao;

@Service("CustomerService")
public class customerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao dao; 

	@Override
	public int placeOrder(Long orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int  reviewOrder(Long orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccount(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int makePayment(Integer paymentId ) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
