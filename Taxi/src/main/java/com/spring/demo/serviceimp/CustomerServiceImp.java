package com.spring.demo.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.Customer;
import com.spring.demo.repo.CustomerRepo;
import com.spring.demo.service.CustomerService;

@Service
public class CustomerServiceImp  implements CustomerService{

	@Autowired
	CustomerRepo repo;
	
	public void addCustomer(Customer cust) {
		repo.save(cust);
		
	}

	public List<Customer> getAllCustomers() {
		return repo.findAll();

	}
	
	public Customer getCustomer(int id) {
        Optional<Customer> optionalCustomer = repo.findById(id);
        if (optionalCustomer.isPresent()) {
            return optionalCustomer.get();
        } else {
            return null;
        }
    }

	public void updateCustomer(Customer cust) {
		repo.save(cust);
		
	}

	public void deleteCustomer(int id) {
		repo.deleteById(id);
		
	}

}
