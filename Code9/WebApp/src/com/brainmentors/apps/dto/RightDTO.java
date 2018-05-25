package com.brainmentors.apps.dto;

public class RightDTO {
	private int id;
	private String name;
	private String screen;
	public RightDTO( String name, String screen) {
		
		this.name = name;
		this.screen = screen;
	}
	public RightDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
