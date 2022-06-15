package com.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.surya.beans.BillGenerator;

@SpringBootApplication
public class BootProj5ValueAnnotationApplication {

	public static void main(String[] args) {
		//get ioc container
	 ApplicationContext ctx = 	 SpringApplication.run(BootProj5ValueAnnotationApplication.class, args);
	  // get spring bean class object
	 BillGenerator generator =  ctx.getBean("bill",BillGenerator.class);
	 System.out.println("data :: "+generator);
	 //close container
	 ((ConfigurableApplicationContext) ctx).close();
	
	} //main
} // class
