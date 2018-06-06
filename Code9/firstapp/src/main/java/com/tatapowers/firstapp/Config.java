package com.tatapowers.firstapp;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name="complex")
	public B getB() {
	B obj = new B();
	obj.x  = 100;
	obj.y = 200;
	obj.y = obj.x + obj.y;
	obj.z="Sum is "+obj.y;
	return obj;
	}

}
