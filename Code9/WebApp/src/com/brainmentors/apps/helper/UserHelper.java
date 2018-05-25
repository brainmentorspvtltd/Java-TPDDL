package com.brainmentors.apps.helper;

import java.sql.SQLException;

import com.brainmentors.apps.dao.UserDAO;
import com.brainmentors.apps.dto.MessageDTO;
import com.brainmentors.apps.dto.UserDTO;
import com.brainmentors.apps.utils.MessageConstants;

public class UserHelper {
	
	public MessageDTO<UserDTO> doLogin(UserDTO userDTO){
		MessageDTO<UserDTO> messageDTO = new MessageDTO<>();
		UserDAO userDAO = new UserDAO();
		try {
			UserDTO userObject = userDAO.doLogin(userDTO);
			if(userObject!=null){
				messageDTO.setMessage("Welcome "+userObject.getUserid());
				messageDTO.setStatus(MessageConstants.SUCCESS);
				messageDTO.setObject(userObject);
			}
			else if(userObject==null){
				messageDTO.setMessage("Invalid Userid or Password");
				messageDTO.setStatus(MessageConstants.FAIL);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			messageDTO.setMessage(e.getMessage());
			messageDTO.setStatus(MessageConstants.ERROR);
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			messageDTO.setMessage(e.getMessage());
			messageDTO.setStatus(MessageConstants.ERROR);
			e.printStackTrace();
		}
		return messageDTO;
	}

}
