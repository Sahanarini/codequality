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

import com.spring.demo.model.Customer;
import com.spring.demo.serviceimp.CustomerServiceImp;


@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {
	
	@Autowired
	CustomerServiceImp service;
	
	@PostMapping
	public String insertStudent(@RequestBody Customer cust) {
		String msg="";
		
		try {
			service.addCustomer(cust);
			msg ="inserted";
			
		}catch(Exception e) {
			
			e.printStackTrace();
			msg="insertion failed";
		}
		return  msg;
	}
	
	
	@GetMapping("{id}")
	public Customer readCustomer(@PathVariable("id") int id) {
		
		return service.getCustomer(id);
	}
	
	
	@GetMapping("/all")
	public List<Customer> getCustomer() {
		
		return service.getAllCustomers();
	}
	
	@PutMapping
	public String updateCustomer(@RequestBody Customer cust) {
		String msg="";
		
		try {
			service.updateCustomer(cust);
			msg ="updated";
			
		}catch(Exception e){
			
			e.printStackTrace();
			msg="not updated";
		}
		return  msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		
         String msg="";
		
		try {
			service.deleteCustomer(id);
			msg ="deleted";
			
		}catch(Exception e) {
			
			e.printStackTrace();
			msg="deleted failed";
		}
		
		return  msg;

	}
	

}
