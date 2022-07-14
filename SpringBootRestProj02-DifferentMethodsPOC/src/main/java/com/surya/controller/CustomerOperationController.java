package com.surya.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {
     
	@GetMapping("/report")
	public ResponseEntity<String> showReport(){
		return new ResponseEntity<String>("From GET-ShowReport Method",HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer() {
		return new ResponseEntity<String>("From POST-registerCustomer",HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateCustomer() {
		return new ResponseEntity<String>("From Put-UpdateCustomer MEthod",HttpStatus.OK);
	}
	
	@PatchMapping("/pmodify")
	public ResponseEntity<String> updateCustomerByNo() {
	  return new ResponseEntity<String>("From Patch-UpdateCustomerByNo Method",HttpStatus.OK);	
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer() {
		return new ResponseEntity<String>("From Delete-Delete Customer Method",HttpStatus.OK);
	}
	
} // class
