package com.surya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
 
	@GetMapping("/welcome")
	public String getMsg() {
		String msg =  "Welcome To SpringBoot Security!!";
		return msg;
	}
	
}
