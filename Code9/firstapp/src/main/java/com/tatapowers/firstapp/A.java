package com.tatapowers.firstapp;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	@Autowired
	B bObject;
	@Autowired
	private B complex; // D.I
	public void callB() {
		System.out.println("Inside A Class...");
		complex.print();
	}

}
