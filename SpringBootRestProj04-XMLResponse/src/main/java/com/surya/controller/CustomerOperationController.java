package com.surya.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.Customer;

@RestController
public class CustomerOperationController {
    
	/*	@GetMapping("/report")
		 public Customer showData() {
			  Customer cust = new Customer(1001,"raja","hyd",44545.77f); 
			  return cust;
		 } */
	
	@GetMapping("/report")
	 public ResponseEntity<Customer> showData() {
		  Customer cust = new Customer(1001,"raja","hyd",44545.77f); 
		  return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	 } 
	
}
