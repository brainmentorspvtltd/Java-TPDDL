package com.brainmentors.apps.dto;

import java.util.ArrayList;

public class RoleDTO {
	private int id;
	private String name;
	private ArrayList<RightDTO> rightList;
	public RoleDTO( String name) {
		
		this.name = name;
	}
	public RoleDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public ArrayList<RightDTO> getRightList() {
		return rightList;
	}
	public void setRightList(ArrayList<RightDTO> rightList) {
		this.rightList = rightList;
	}
	

}
