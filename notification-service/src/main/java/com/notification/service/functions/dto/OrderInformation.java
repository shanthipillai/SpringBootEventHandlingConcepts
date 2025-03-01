package com.notification.service.functions.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderInformation {

	
	private String orderId;
	private String userId;
	//private Date createDate;
	private String price;
	private String emailId;
	private String userPhone;
}
