//WishMessageGenerator.java
package com.surya.beans;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
    
	@Autowired  // Field Injection
	@Qualifier("ldt1")
	private LocalDateTime date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-Param constructor");
	}
	//Business method
	public String generateWishMessage(String user) 
	{
		//get current hour of the day
		int hour = date.getHour();
		//generate wish Messagem
		if(hour < 12)
			return "GOOD MORNING "+user;
		else if(hour < 16)
			return "Good AfterNoon "+user;
		else if(hour < 20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}
      
}
