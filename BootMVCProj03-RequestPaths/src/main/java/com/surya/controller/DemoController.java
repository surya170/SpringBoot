package com.surya.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
public class DemoController {
   
	@GetMapping(value= {"/report"})
   	public String generateReport(Map<String, Object> map) {
   		System.out.println("DemoController.generateReport(-)");
   		return "display";
   	}
	
}
