package com.spring.demo.service;

import java.util.List;

import com.spring.demo.model.Booking;

public interface BookingService {
	public void addBooking(Booking p);
	public Booking getBooking(int tid);
	public List<Booking> getAllBooking();
	public void updateBooking(Booking p);
	public void deleteBooking(int tid);
	List<Integer> fetchAlltid();
	

}
