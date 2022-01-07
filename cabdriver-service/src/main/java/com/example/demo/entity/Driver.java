package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "drivers_2021")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2500743867102619438L;

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "firstname")
    private String firstName;
	
	@Column(name = "lastname")
    private String lastName;
	
	@Column(name = "email")
    private String email;
	
	@Column(name = "mobilenumber")
	
	private long mobileNumber;
	
	@Column(name = "birthdate")
	@DateTimeFormat(iso = ISO.DATE)
    private LocalDate birthDate;



}
