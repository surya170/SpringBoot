package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICoronaVaccineRepo;

@Service("vaccineMgmtService")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private  ICoronaVaccineRepo coronaRepo;
	
	@Override
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,
				  properties );
		Iterable <CoronaVaccine>  listEntities = coronaRepo.findAll(sort );
		return listEntities;
	}   
  
}//class
