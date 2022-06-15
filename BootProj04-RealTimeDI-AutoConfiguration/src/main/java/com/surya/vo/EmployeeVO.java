package com.surya.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeVO implements Serializable  {
     
	private String srNo;
	private String empNo;
	private String  ename;
	private String job;
	private String sal;
	private String deptNo;
	private String mgrNo;
	
}
