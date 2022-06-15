package com.virtusa.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("company1")
public class CompanyDetails1 {
    @Value("${org.virtusa.name}")
	private String title;
    @Value("${org.virtusa.type}")
	private String type;
    @Value("${org.virtusa.location}")
	private String addrs;
    
	@Override
	public String toString() {
		return "CompanyDetails1 [title=" + title + ", type=" + type + ", addrs=" + addrs + "]";
	} //toString()
	
} // class
