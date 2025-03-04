package com.demo.service;

public class MessageNotify implements MessageService {

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("get message implements");
		
	}

	@Override
	public String welcomeMessage() {
		// TODO Auto-generated method stub
		return "Good morning";
	}

}
