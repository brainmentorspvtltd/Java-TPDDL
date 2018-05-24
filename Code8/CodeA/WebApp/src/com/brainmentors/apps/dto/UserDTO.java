package com.brainmentors.apps.dto;

public class UserDTO {
	private String userid;
	private String pwd;
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
