package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookingHistory;

public interface BookingRepository extends JpaRepository<BookingHistory, String> {

	public List<BookingHistory> findByDriverId(int driverId);
}
