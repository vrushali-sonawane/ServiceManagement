package com.BikkaIT.SpingMVCFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {
	@GetMapping("/welcomeMessage")
	public String welcomeMessage(Model model) {
		String welmsg="Welcome to bikkadit";
		model.addAttribute("MSG",welmsg);
		return "wel";
		
	}
	

}
