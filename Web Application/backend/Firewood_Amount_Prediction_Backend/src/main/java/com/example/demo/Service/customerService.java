package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Repository.customerRepo;

@Service
public class customerService {

	@Autowired
	private customerRepo repo;

	// Save Customer
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
	}

	// Get All Customers
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	// Get Customer By ID
	public Customer getCustomerById(Long id) {
		return repo.findById(id).get();
	}

	// Update Customer
	public Customer updateUser(Long id, Customer customer) {
		Customer customer2 = repo.findById(id).get();
		customer2.setName(customer.getName());
		customer2.setNic(customer.getNic());
		customer2.setAddress(customer.getAddress());
		customer2.setNumber(customer.getNumber());
		customer2.setUserName(customer.getUserName());
		customer2.setPassword(customer.getPassword());

		return repo.save(customer2);
	}
	
	//Delete Customer
	public void deleteCustomer(Long id) {
		repo.deleteById(id);
	}

}
