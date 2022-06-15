package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	 public List<CoronaVaccine>  searchVaccinesByGivenData(CoronaVaccine vaccine,boolean ascOrder,String... properties);
	 public CoronaVaccine getVaccineByRegNo(long regNo);
	 public String removeVaccineByRegNos(Iterable<Long> regNo);
}
