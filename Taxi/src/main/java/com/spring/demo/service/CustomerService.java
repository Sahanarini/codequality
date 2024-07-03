package com.spring.demo.service;

import java.util.List;

import com.spring.demo.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer cust) ;
	public Customer getCustomer(int id) ;
	public List<Customer> getAllCustomers() ;
	public void updateCustomer(Customer cust);
	public void deleteCustomer(int id);



}
