package com.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.surya.controller")
public class SpringBootSecurity01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurity01Application.class, args);
	}

}
