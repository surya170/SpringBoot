package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class BootDataJpaProj02PAndSRepoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BootDataJpaProj02PAndSRepoApplication.class, args);
			}

} // class
