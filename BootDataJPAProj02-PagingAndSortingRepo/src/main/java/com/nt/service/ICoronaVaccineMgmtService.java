package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties);
 
}
