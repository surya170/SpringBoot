package com.virtusa.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("company")
@Data
@ConfigurationProperties(prefix = "org.virtusa")
public class CompanyDetails {
    
	private String title="Virtusa polaris";          // here we use default value if key not match its print default value
	private String type;
	private String location;
	
	@Override
	public String toString() {
		return "CompanyDetails [name=" + title + ", type=" + type + ", location=" + location + "]";
	}
	
	
	
	
}
