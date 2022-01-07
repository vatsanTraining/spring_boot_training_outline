package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Slf4j
@Component("reviewBean")
public class Review {

	int id;
	String restaurantName;
	String reviewedBy;
	String reviewAspect;
	String reviewBody;
	double reviewRating;
	public Review() {
		super();

		log.info("Review Initialized");
	}

	
}
