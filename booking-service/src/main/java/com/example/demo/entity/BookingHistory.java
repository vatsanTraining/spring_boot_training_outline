package com.example.demo.entity;

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
@Table(name = "bookings_2022")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookingHistory {

	
    @Id
    @Column(name="booking_id")
	private String bookingId;
    
   
    @Column(name="driver_id")
	private int driverId;
    
    @DateTimeFormat(iso = ISO.DATE_TIME)
    @Column(name="booking_date")
	private LocalDate bookingDate;
    
    
    
    @Column(name="total_fare")
    private float totalFare;
    
    
    @Column(name="mode_of_payment")
    private String modeOfPayment;

    
}
