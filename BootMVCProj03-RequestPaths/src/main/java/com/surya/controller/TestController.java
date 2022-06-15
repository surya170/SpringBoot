package com.surya.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/REPORT")
	public String showReport(Map<String, Object> map) {
		System.out.println("TestController.showReport(-)");
		return "display";
	}

	@RequestMapping("/report")
	public String showReport1(Map<String, Object> map) {
		System.out.println("TestController.showReport1(-)");
		return "display";
	}

}
