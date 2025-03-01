package com.notification.service.functions;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.notification.service.functions.dto.OrderInformation;

@Configuration
public class OrderNotificationFunction {

	@Bean
	public Function<OrderInformation, String> orderEventReceived()
	{
		return(orderDetails->{
			System.out.println("Sending notification to user");
		    logicToSendEmailAndMessage(orderDetails.getEmailId(),orderDetails.getUserId());
		    return "order notification send to the user";
		});
	}

	private void logicToSendEmailAndMessage(String emailId, String userId) {
		// TODO Auto-generated method stub
		System.out.println("Email Id"+emailId);
		System.out.println("UserId"+userId);
	}
}
