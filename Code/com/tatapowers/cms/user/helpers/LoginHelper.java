package com.tatapowers.cms.user.helpers;

import com.tatapowers.cms.user.dao.LoginDAO;
import com.tatapowers.cms.user.dto.MessageDTO;
import com.tatapowers.cms.user.dto.UserDTO;

public class LoginHelper {
	String negativeUsers[]= {"Tom","Tim","Kim"};
	public MessageDTO doLogin(UserDTO userDTO) {
		MessageDTO messageDTO = new MessageDTO();
		boolean isFound = false;
		for(String user : negativeUsers) {
			if(user.equalsIgnoreCase(userDTO.getUserid())) {
				messageDTO.setUserid(userDTO.getUserid());
				messageDTO.setStatusCode(1000);
				messageDTO.setMessage("Invalid User Comes Under Negative List");
				isFound = true;
				break;
			}
		}
		if(!isFound) {
			//LoginDAO
			LoginDAO loginDAO = new LoginDAO();
			if(loginDAO.doLogin(userDTO)) {
				messageDTO.setMessage("Welcome  ");
				messageDTO.setUserid(userDTO.getUserid());
				messageDTO.setStatusCode(200);
			}
			else {
				messageDTO.setMessage("Invalid Userid or Password...  ");
				messageDTO.setUserid(userDTO.getUserid());
				messageDTO.setStatusCode(500);
			}
		}
		return messageDTO;
	}

}
