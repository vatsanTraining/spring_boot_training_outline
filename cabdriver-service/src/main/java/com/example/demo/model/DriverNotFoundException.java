package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DriverNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 516323246437287535L;
	
	private  String message;
	
	
	
	@Override
	public String getMessage() {
		return this.message;
	}

	
}
