package com.spring.demo.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.Booking;
import com.spring.demo.repo.BookingRepo;
import com.spring.demo.service.BookingService;

@Service
public class BookingServiceImp implements BookingService {

	
	@Autowired
	BookingRepo repo;

	public void addBooking(Booking p) {
		repo.save(p);
		
	}

	
	public Booking getBooking(int tid) {
        Optional<Booking> optionalCustomer = repo.findById(tid);
        if (optionalCustomer.isPresent()) {
            return optionalCustomer.get();
        } else {
            return null;
        }
    }

	public List<Booking> getAllBooking() {
		return repo.findAll();

	}

	public void updateBooking(Booking p) {
		repo.save(p);
		
	}

	public void deleteBooking(int tid) {
		repo.deleteById(tid);
		
	}

	public List<Integer> fetchAlltid() {
		return repo.fetchAlltid();
		
	}
	
	
	public List<Integer> getAlltid() {
		return repo.fetchAlltid();
		
		
		}

}
