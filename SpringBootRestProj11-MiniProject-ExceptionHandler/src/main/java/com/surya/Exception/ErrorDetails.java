package com.surya.Exception;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    
	private LocalDateTime time;
	private String msg;
	private String status;
	
	
}

