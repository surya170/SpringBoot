package com.surya;

import java.io.PrintStream;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.surya.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj001DependencyInjectionApplication {

	@Bean(name="ldt")
	@Scope("prototype")
	public LocalDateTime createLocalDateTime() {
		System.out.println("BootProj001DependencyInjectionApplication.createLocalDateTime()");
		LocalDateTime ldt = LocalDateTime.now();
		return ldt;
	}
	
	@Bean(name="ldt1")
	@Scope("prototype")
	public LocalDateTime createLocalDateTime1() {
		System.out.println("BootProj001DependencyInjectionApplication.createLocalDateTime1()");
		LocalDateTime ldt = LocalDateTime.now();
		return ldt;
	}
	
	
	public static void main(String[] args) {
		//get ioc container
		ApplicationContext ctx = SpringApplication.run(BootProj001DependencyInjectionApplication.class, args);
		//get target spring bean  class from from ioc container
		
	 	WishMessageGenerator  generator = ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke  methods
		String result = generator.generateWishMessage("raja");
		System.out.println(result);
		//close container
		((ConfigurableApplicationContext) ctx).close();  
		
	}

}
