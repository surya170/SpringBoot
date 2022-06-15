package com.surya.dao;

import java.util.List;

import com.surya.bo.EmployeeBO;

public interface IEmployeeDAO {
    public List<EmployeeBO> getEmpByDesg(String cond) throws Exception;
}
