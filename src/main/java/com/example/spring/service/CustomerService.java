package com.example.spring.service;

public interface CustomerService {
	public int placeOrder(Long orderId);

	public int reviewOrder(Long orderId);

	public String createAccount(String userName);

	public int makePayment(Integer paymentId );


}
