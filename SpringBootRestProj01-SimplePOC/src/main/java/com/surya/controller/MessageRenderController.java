package com.surya.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController // { @Controller + @ResponseBody on all methods
@Controller
@RequestMapping("/message")
public class MessageRenderController {
 
	@GetMapping("/generate")
	//@ResponseBody
	public ResponseEntity<String> generateMessage() {
		//get system date and time 
		LocalDateTime ldt = LocalDateTime.now();
		// get current  Hour of the day 
		int hour = ldt.getHour();
		
		String body = null;
		if (hour < 12)
			body = "Good Morning";
		else if (hour < 16)
			body = "Good Evening";
		else if (hour < 20)
			body = "Good  AfterNoon";
		else
			body = "Good Night";
		// Response status
		HttpStatus status = HttpStatus.OK;
		// create ResponseEntity object
		ResponseEntity<String> entity = new ResponseEntity<String>(body, status);
		// return RepsonseEntity having Respnse body and Response status.
		return entity;
		
	} // method

} // class
