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
			Iterable<CoronaVaccine> listEntities = service.fetchDetails(true, "price","name");
			listEntities.forEach(System.out::println);
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		*/
		/*try {
			// Total 6 pages and page size is 2 so, 6/2 == 3 
			// 3 pages are there , in that
			// i asked 2nd page  details
			service.fetchDetailsByPageNo(1, 2, true, "price").forEach(System.out::println);
		} 
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}*/
		
		
		// Displaying huge number of Records page by page or Part by Part in Console Environment 
		try {
			service.fetchDetailsbyPagination(2);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	}

}
