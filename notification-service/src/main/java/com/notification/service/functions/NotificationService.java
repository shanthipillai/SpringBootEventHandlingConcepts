package com.notification.service.functions;

import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.notification.service.functions.dto.OrderInformation;

@Configuration
public class NotificationService {

	@Bean
	public Supplier<String> testing()
	{
		return()->"This is testing";
	}
	
	@Bean
	public Function<String, String> sayHello()
	{
		return (message)->"Hello how are you?"+message;
	}
	
	@Bean
	public Function<OrderInformation, OrderInformation> orderInfo()
	{
		return (order)->order;
	}
	
}
