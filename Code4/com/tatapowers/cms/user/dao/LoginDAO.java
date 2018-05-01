package com.tatapowers.cms.user.dao;

import com.tatapowers.cms.user.dto.UserDTO;

public class LoginDAO {
	public boolean doLogin(UserDTO userDTO) {
//		if(userDTO.getUserid().equals(userDTO.getPassword())) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return userDTO.getUserid().equals(userDTO.getPassword());
	}

}
