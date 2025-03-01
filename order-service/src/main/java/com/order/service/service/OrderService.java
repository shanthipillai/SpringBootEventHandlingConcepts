package com.order.service.service;

import org.springframework.stereotype.Service;

import com.order.service.dto.OrderInformation;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class OrderService {

	
	
	public OrderInformation createOrder()
	{
		OrderInformation orderinfo= OrderInformation.builder().userId("1354543")
				.emailId("testing@gmail.com")
				.orderId("12344")
				.price("56888")
				.userPhone("9010877494")
				.build()
				;
		
		return orderinfo;
	}
}
