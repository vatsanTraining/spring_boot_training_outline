package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

@Component
public class Restaurant {

	  private int id;
	    private String name;
	    private String serviceArea;
	    private String emailAddress;
	    private String menuType;
	    private String openingHours;

	    
	    private Review review;
	    
}
