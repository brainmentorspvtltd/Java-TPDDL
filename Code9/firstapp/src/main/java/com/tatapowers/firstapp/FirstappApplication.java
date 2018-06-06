package com.tatapowers.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstappApplication {
	
	public static void main(String[] args) {
		//SpringApplication.run(FirstappApplication.class, args);
		ApplicationContext context = SpringApplication.run(FirstappApplication.class, args);
		A obj = (A)context.getBean("aObject");
		obj.callB();
		//aObject.callB();
	}
}
