package com.brainmentors.apps.dto;

import java.util.ArrayList;

public class GroupDTO {
	private int id;
	private String name;
	private ArrayList<RoleDTO> roleList;
	public GroupDTO( String name) {
		
		this.name = name;
	}
	public GroupDTO(int id, String name) {
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
	public ArrayList<RoleDTO> getRoleList() {
		return roleList;
	}
	public void setRoleList(ArrayList<RoleDTO> roleList) {
		this.roleList = roleList;
	}
	

}
