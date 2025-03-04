package com.demo.test;

import com.demo.service.MessageNotify;
import com.demo.service.MessageService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to java");
		System.out.println(new MessageNotify().welcomeMessage());
		new MessageNotify().getMessage();
	}

}
