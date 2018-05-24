package com.brainmentors.apps.utils;

public interface SQLConstants {
	String USER_LOGIN_SQL = "select userid, pwd from users where userid=? and pwd=?";

}
