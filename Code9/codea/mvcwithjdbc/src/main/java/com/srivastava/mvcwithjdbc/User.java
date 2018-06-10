package com.srivastava.mvcwithjdbc;

import org.springframework.stereotype.Component;

@Component
public class User {
private String userid;
private String pwd;

public User() {}
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
@Override
public String toString() {
	return "User [userid=" + userid + ", pwd=" + pwd + "]";
}

}
