package com.tatapowers.firstapp;

import org.springframework.stereotype.Component;

//@Component("bobj")
public class B implements IB {
	int x;
	int y;
	String z;
	@Override
public void print() {
	System.out.println("B Print..."+this);
}
	@Override
	public String toString() {
		return "B [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
