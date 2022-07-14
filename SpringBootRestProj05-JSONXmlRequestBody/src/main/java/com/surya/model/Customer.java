package com.surya.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	private Integer cno;
	private String cname;
	private String cadd;
	private Float billAmt;
	

}
