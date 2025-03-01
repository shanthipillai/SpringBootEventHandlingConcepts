package com.order.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.dto.OrderInformation;
import com.order.service.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	
	OrderService orderService;
	@Autowired
	private StreamBridge streamBridge;
	
	@PostMapping("createOrder")
	public ResponseEntity<?> createOrder()
	{
		
		OrderInformation info=this.orderService.createOrder();
		ordercreatedNotification(info);
		return ResponseEntity.ok("Order Created");
		
	}

	private void ordercreatedNotification(OrderInformation orderinfo) {
		// TODO Auto-generated method stub
		boolean send=streamBridge.send("orderCretedEvent-out-0",orderinfo);
		if(send)
			System.out.println("Event is successfully send to notification service");
		else
			System.out.println("Event failed");
		
	}
}
