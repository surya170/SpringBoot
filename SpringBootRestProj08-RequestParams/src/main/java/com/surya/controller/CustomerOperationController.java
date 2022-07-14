package com.surya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CustomerOperationController {
   
	@GetMapping("/report")
	//@PostMapping("/report")
	public String reportData(@RequestParam("cno") Integer no ,  @RequestParam(required = true) String cname )  {
	  return no+" "+cname;	
	}
}
