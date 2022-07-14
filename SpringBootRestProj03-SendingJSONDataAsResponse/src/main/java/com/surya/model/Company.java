package com.surya.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	
  private String name;
  private String addr;
  private String type;
  private Integer size;
  
}
