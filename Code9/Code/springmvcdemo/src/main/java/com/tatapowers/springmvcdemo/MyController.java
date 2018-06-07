package com.tatapowers.springmvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@Autowired
	private MyService service;
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerHere(@RequestParam("userid") String userid, @RequestParam("pwd") String pwd, Model model) {
		String data = service.add(userid, pwd)>0?"Record Added":"Not Added";
		model.addAttribute("result", data);
		return "index";
	}

}
