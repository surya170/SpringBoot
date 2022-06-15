package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine,Long> {
	     // SELECT REGNO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED
          public List<CoronaVaccine> findByCompany(String company);
        // 
}
// Interface closed.