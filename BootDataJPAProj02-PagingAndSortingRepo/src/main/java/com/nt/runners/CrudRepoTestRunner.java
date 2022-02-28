package com.nt.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.exception.DataException;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineMgmtService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			Iterable<CoronaVaccine> listEntities = service.fetchDetails(true, "price");
			listEntities.forEach(System.out::println);
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		
	}

}
