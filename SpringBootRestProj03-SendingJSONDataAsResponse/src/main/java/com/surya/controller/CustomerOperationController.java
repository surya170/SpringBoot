package com.surya.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.Company;
import com.surya.model.ComplexCustomer;
import com.surya.model.Customer;

@RestController
public class CustomerOperationController {
    
	@GetMapping("/report")
	public ResponseEntity<Customer> showData() {
		// reponse body
       Customer cust = new Customer(1001,"raja",54566.12f);
       //reponse  status
       HttpStatus status = HttpStatus.OK;
       // Returning ResponseEntity 
       return new ResponseEntity<Customer>(cust,status);
    }
	
	@GetMapping("/report1")
	public ResponseEntity<ComplexCustomer> showData1() {
		// Reponse body
		ComplexCustomer cust = new ComplexCustomer(1001,"raja",54566.66f,
				                     new String[] {"red","green","blue"},
				                     List.of("10th","10+2","B.Tech"),
				                     Set.of(54555233L,5423548L,6852315L),
				                     Map.of("aadhar",35345435L,"panNo",354889522L),
				                     new Company("Samsung","Hyd","Electronics",4000)
				);
		// Reponse staus
		HttpStatus status = HttpStatus.OK;
		// returning Reponse Status
		return new ResponseEntity<ComplexCustomer>(cust,status);
		
	}
	
}
