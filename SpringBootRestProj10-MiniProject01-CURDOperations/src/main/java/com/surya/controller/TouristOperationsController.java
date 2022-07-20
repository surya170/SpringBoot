package com.surya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.Exception.TouristNotFoundException;
import com.surya.entity.Tourist;
import com.surya.service.ITouristMgmtService;

@RestController
@RequestMapping("/tourist")
public class TouristOperationsController {

	@Autowired
	private ITouristMgmtService service;

	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist) {
		try {
			// use service
			String resultMsg = service.registerToursit(tourist);
			return new ResponseEntity<String>(resultMsg, HttpStatus.CREATED); // 201 : Content created successfully
		} catch (Exception e) {
			return new ResponseEntity<String>("problem in tourist enrollment", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} //enrollTourist  Method
	
	@GetMapping("/findAll")
	public ResponseEntity<?> displayToursits() {
		   try {
			    List<Tourist> list = service.fetchAllTourists();
			    return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK); // 200 : Success Code
		   }
		   catch(Exception e) 
		   {
			   e.printStackTrace();
			   return new ResponseEntity<String>("Problem in Fetching Tourists",HttpStatus.INTERNAL_SERVER_ERROR); // 500 : Internal Server Error
		   }
	} //displayToursits() Method
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayTouristById(@PathVariable("id") Integer id) {
		   try {
			  Tourist tourist = service.fetchTouristById(id);
			  return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
		   }
		   catch(Exception e) 
		   {
			   e.printStackTrace();
			   return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		   }
	}   // displayTouristById() Method 
	
	
	@PutMapping("/modify")
	public ResponseEntity<String> modifyTourist(@RequestBody Tourist tourist) { 
		try {
			 String msg = service.updateTouristDetails(tourist);
			 return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} //modifyTourist() method
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeTourist(@PathVariable("id") Integer id)
	{
		try {
			   // use Service 
			String msg = service.deleteTourist(id);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		  return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	} // removeTourist() Method
	
	@PatchMapping("/budgetModify/{id}/{hike}")
	public ResponseEntity<String> ModifyTouristBudgetById(@PathVariable("id") Integer id, @PathVariable("hike") Float hikePercent ) {
		try {
			// use service			
			String msg = service.updateTouristBudgetById(id,hikePercent);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
	
	   
	
}  // class
