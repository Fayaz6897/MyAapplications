package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Login;

@Controller
public class MainControler {
	@RequestMapping(value = "/login")
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login";
		
	}
	@RequestMapping("/success")
    public String submit(Model m, @ModelAttribute("login") Login loginBean ) {
		System.out.println(loginBean.getUname());
        if(loginBean != null && loginBean.getUname() != null & loginBean.getPassword() != null) {
        	//System.out.println(loginBean.getUname());
            if(loginBean.getUname().equals("pulpy") && loginBean.getPassword().equals("orange")) {
            m.addAttribute("msg",loginBean.getUname());
        return "success";
        }
        else {
            m.addAttribute("error","Invalid Details");
            return "error";
        }    
    }else {
        m.addAttribute("error","Please enter Details");
        return "login";
        }
    }
	

}
