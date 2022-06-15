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

		/*try {
		//	CoronaVaccine vaccine = new CoronaVaccine("sputnik","Russie","Russia",567.8,2);
			CoronaVaccine vaccine = new CoronaVaccine();
			vaccine.setCompany("Russie");
			vaccine.setPrice(567.8);
			service.searchVaccinesByGivenData(vaccine, true, "price").forEach(System.out::println);;
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}   
		*/
		
		
		/* try {
			CoronaVaccine vaccine = service.getVaccineByRegNo(26);
			if (vaccine != null)
				System.out.println("Vaccine Details :: " + vaccine);
			else
				System.out.println("Record Not Found ");
		}  catch (DataAccessException dae) {
			dae.printStackTrace();
		}*/
		
		try {
			System.out.println(service.removeVaccineByRegNos(List.of(24L,21L)));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		
	}  // main

} // class
