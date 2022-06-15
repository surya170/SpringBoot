package com.surya.service;

import java.util.List;

import com.surya.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
   public List<EmployeeDTO> fetchEmpsByDesgs(String desgs[]) throws Exception;
   
}
