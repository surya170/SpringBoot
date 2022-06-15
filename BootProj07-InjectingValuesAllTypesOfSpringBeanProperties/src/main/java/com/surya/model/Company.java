package com.surya.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("comp")
public class Company {
	private String title;
	private String location;
	private int size;
}
