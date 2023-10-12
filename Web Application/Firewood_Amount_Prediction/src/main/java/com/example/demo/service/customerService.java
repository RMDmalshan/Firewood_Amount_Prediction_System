package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;
import com.example.demo.model.User;

public interface customerService {
	
	void deleteCustomerByID(Long id);
	User saveCustomer(User admin);
//	User getCustomerById(Long id);
//	User updaCustomer(User admin);
}
