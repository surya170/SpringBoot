package com.surya.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.Customer;

@RestController
public class CustomerOperationsController {
	
	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer cust) {
		 return cust.toString();
	}

}
