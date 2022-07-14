package com.surya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CustomerOperationController {
   
	@GetMapping("/report")
	public String reportData(@RequestParam("cno") Integer no ,  @RequestParam String cname )  {
	  return no+" "+cname;	
	}
}
