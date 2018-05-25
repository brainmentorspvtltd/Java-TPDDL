package com.brainmentors.apps.dto;
//@Table
public class UserDTO {
	//@Id
	private String userid;
	private String pwd;
	//@OneToOne
	private GroupDTO groupDTO;
	
	public GroupDTO getGroupDTO() {
		return groupDTO;
	}
	public void setGroupDTO(GroupDTO groupDTO) {
		this.groupDTO = groupDTO;
	}
	public UserDTO(){
		
	}
	public UserDTO(String userid, String pwd){
		this.userid = userid;
		this.pwd = pwd;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String toString(){
		return "Userid "+userid+" Password "+pwd;
	}
}
