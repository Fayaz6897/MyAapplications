package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.User;

@Controller
public class UserController {
	@RequestMapping("/login")
	String displayPage() {
		System.out.println("Inside Login Controller");
		return "Login1";
	}

	@RequestMapping("/Registration")
	String displayRegistration() {
		System.out.println("Inside Registration");
		return "Registration";
	}

	@RequestMapping("/register")
	String displayUserDetails(@ModelAttribute("user") User userb, @RequestParam("userId") String uid,
			@RequestParam("password") String pwd, Model m) {
		System.out.println("Inside RegistrationDetails");

		userb.setUname(uid);
		userb.setPwd(pwd);
		System.out.println("UserID" + userb.getUname());
		m.addAttribute("user_name", userb.getUname());
		return "RegistrationDetails";

	}

}
