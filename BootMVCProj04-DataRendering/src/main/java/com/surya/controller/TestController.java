package com.surya.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    
	
	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		//add model attributes ( Simple Values )
		map.put("name","raja");
		map.put("age",22);
		map.put("addrs", "hyd");
		//return LVN
		return "show_report";
	}
	
}
