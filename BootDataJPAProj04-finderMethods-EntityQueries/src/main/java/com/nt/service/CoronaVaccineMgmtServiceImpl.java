package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICoronaVaccineRepo;

@Service("vaccineMgmtService")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {

	@Autowired
	private  ICoronaVaccineRepo coronaRepo;

	@Override
	public List<CoronaVaccine> searchVaccinesByGivenData(CoronaVaccine vaccine, boolean ascOrder,String... properties) {
		 // prepare Example Object 
		Example example = Example.of(vaccine);
		// prepare Sort Object 
		Sort sort  = Sort.by(ascOrder?Direction.ASC : Direction.DESC,properties);
		List<CoronaVaccine> listEntities = coronaRepo.findAll(example, sort);
 		return listEntities;
	}

	@Override
	public CoronaVaccine getVaccineByRegNo(long regNo) {	
		return coronaRepo.getById(regNo);
	}

	@Override
	public String removeVaccineByRegNos(Iterable<Long> regNos) {
		Iterable<CoronaVaccine> listEntities = coronaRepo.findAllById(regNos);
		if(((List<CoronaVaccine>) listEntities).size() != 0) {
			 coronaRepo.deleteAllById(regNos);
			 return ((List<CoronaVaccine>) listEntities).size() + "no:of  records are deleted ";
		}
		return " records not found for deletion"  ;
	}
	

  
}//class
