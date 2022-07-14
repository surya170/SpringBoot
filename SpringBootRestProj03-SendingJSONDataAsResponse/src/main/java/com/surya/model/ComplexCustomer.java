package com.surya.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplexCustomer {
  
	private Integer cno;
	private String cname;
	private Float billAmt;
	// Array Properties
	private String[] favColors;
	// List Properties
	private List<String> studies;
	// Set Properties
	private Set<Long> phoneNumbers;
	// Map Properties 
	private Map<String,Object> idDetails;
	// HAS-A Property
	private Company company;
}
