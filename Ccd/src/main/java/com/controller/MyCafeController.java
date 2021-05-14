package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	@RequestMapping("/cafe")
	public String welcomePage() {
		// sending data to view using model

		return "index";

	}

	@RequestMapping("/process-order")
	public String order(HttpServletRequest request, Model model) {
		// handling the received from the user
		String userInput = request.getParameter("foodType");
		model.addAttribute("value", userInput);
		return "order";
	}

}
