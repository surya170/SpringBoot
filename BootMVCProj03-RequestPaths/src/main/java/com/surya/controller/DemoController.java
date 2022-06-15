package com.surya.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {
   
	@GetMapping("/report1")
   	public String generateReport(Map<String, Object> map) {
   		System.out.println("TestController.generateReport(-)");
   		return "display";
   	}
	
}
