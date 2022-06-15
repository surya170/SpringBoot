package com.surya.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerator {
	
	@Value("#{info.dosaPrice+info.pohaPrice+info.idlyPrice}")
	private float total;	
	@Value("Paradise")
	private String  hotelName;
	@Autowired // Actually not required
	private ItemsInfo items;
	
	// ALT + SHIFT +S,S
	@Override
	public String toString() {
		return "BillGenerator [total=" + total + ", hotelName=" + hotelName + ", items=" + items + "]";
	} //method
} //class
