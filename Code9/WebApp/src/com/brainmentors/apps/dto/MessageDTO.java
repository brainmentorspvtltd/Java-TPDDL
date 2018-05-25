package com.brainmentors.apps.dto;

public class MessageDTO<T> {
	private String message;
	private int status;
	private T object ;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	
	
}
