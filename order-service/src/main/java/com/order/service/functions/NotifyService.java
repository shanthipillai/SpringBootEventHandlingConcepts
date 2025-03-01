package com.order.service.functions;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotifyService {

	@Bean
	public Consumer<String> consumeAck()
	{
		return(str)->
		System.out.println("From Order Service"+str);
	}
}
