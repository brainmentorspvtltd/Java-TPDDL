package com.srivastava.mvcwithjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("/")
	   public String index() {
	      return "index";
	   }
	@Autowired
	private MyService service;
	@Autowired
	private User user;
	@PostMapping("/register")
	public String register(@RequestParam("userid") String userid, @RequestParam("pwd") String password, Model model) {
		user.setUserid(userid);
		user.setPwd(password);
		String msg = service.add(user);
		model.addAttribute("result",msg);
		return "index";
	}
}
