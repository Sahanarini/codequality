package com.spring.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Booking;

@Repository
public interface BookingRepo extends JpaRepository <Booking,Integer> {

	@Query("select tid from Booking")
	List<Integer> fetchAlltid();

}
