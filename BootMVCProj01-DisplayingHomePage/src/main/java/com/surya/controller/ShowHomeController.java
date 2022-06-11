package com.surya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShowHomeController {

	// @RequestMapping("/welcome")
	@RequestMapping("/")
	public String showHomePage() {
		return "home";
	}
}
