package com.surya.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable  {
     
	private Integer empNo;
	private String  ename;
	private String job;
	private Double sal;
	private Integer deptNo;
	private Integer mgrNo;
	private Integer srNo;
}
