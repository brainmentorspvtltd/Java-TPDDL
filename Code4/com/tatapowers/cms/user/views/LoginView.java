package com.tatapowers.cms.user.views;

import java.util.Scanner;

import com.tatapowers.cms.user.dto.MessageDTO;
import com.tatapowers.cms.user.dto.UserDTO;
import com.tatapowers.cms.user.helpers.LoginHelper;

public class LoginView {
	void doLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		UserDTO userDTO = new UserDTO(userid, pwd);
		LoginHelper helper = new LoginHelper();
		MessageDTO messageDTO = helper.doLogin(userDTO);
		System.out.println(messageDTO.getMessage()+ " "+messageDTO.getUserid());
		System.out.println(messageDTO.getStatusCode());
		scanner.close();
		
	}
	public static void main(String[] args) {
		LoginView loginView = new LoginView();
		loginView.doLogin();
				
	}

}
