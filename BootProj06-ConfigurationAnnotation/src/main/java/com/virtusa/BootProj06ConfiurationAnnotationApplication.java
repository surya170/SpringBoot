package com.virtusa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.virtusa.beans.CompanyDetails;
import com.virtusa.beans.CompanyDetails1;

@SpringBootApplication
public class BootProj06ConfiurationAnnotationApplication {

	public static void main(String[] args) {
		//get ioc container
	 ApplicationContext ctx = 	 SpringApplication.run(BootProj06ConfiurationAnnotationApplication.class, args);
	  // get spring bean class object
	
	 CompanyDetails company1 = ctx.getBean("company",CompanyDetails.class) ;
	 System.out.println(company1);
	 System.out.println("------------------------------------------------");
	 CompanyDetails1 company2 = ctx.getBean("company1",CompanyDetails1.class) ;
	 System.out.println(company2);
	  
	 //close container
	 ((ConfigurableApplicationContext) ctx).close();
	
	} //main
} // class
