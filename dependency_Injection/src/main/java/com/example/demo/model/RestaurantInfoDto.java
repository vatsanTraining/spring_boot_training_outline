package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component

@ToString
public class RestaurantInfoDto {

	private Restaurant restaurant;
	private Review review;
	
		
}
