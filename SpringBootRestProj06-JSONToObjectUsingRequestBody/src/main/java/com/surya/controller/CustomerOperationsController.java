package com.surya.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.Customer;

@RestController
public class CustomerOperationsController {
	
	@PostMapping("/register")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer cust) {
		  return new ResponseEntity<String>(cust.toString(),HttpStatus.OK);
	}

}
