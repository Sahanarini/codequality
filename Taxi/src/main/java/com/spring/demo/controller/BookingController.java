package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Booking;
import com.spring.demo.serviceimp.BookingServiceImp;


@RestController
@RequestMapping("/booking")
@CrossOrigin("*")

public class BookingController {

	@Autowired
	BookingServiceImp service;
	
	@PostMapping
	public String insertBooking(@RequestBody Booking p) {
		String msg="";
		
		try {
			service.addBooking(p);
			msg ="inserted";
			
		}catch(Exception e) {
			
			e.printStackTrace();
			msg="insert failed";
		}
		return  msg;
	}
	
	@GetMapping("{tid}")
	public Booking readBooking(@PathVariable("tid") int tid) {
		
		return service.getBooking(tid);
	}
	
	
	@GetMapping("/all")
	public List<Booking> getBooking() {
		
		return service.getAllBooking();
	}
	
	@PutMapping
	public String updateBooking(@RequestBody Booking p) {
		String msg="";
		
		try {
			service.updateBooking(p);
			msg ="updated";
			
		}catch(Exception e){
			
			e.printStackTrace();
			msg="Updated Failed";
		}
		return  msg;
	}
	
	@DeleteMapping("{tid}")
	public String deleteBooking(@PathVariable("tid") int tid) {
		
         String msg="";
		
		try {
			service.deleteBooking(tid);
			msg ="Deleted";
			
		}catch(Exception e) {
			
			e.printStackTrace();
			msg="deleted failed";
		}
		
		return  msg;

	}
	
	@GetMapping("/idList")
	public List<Integer> getAlltid(){
		return service.fetchAlltid();
		
	}
	
}
