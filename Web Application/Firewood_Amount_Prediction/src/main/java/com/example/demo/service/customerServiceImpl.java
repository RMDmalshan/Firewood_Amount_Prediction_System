package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.repository.customerRepo;

@Service
public class customerServiceImpl implements customerService {

	private customerRepo repo;
	private UserRepo userRepo;
	private BCryptPasswordEncoder passwordEncoder;
	
	public customerServiceImpl(customerRepo repo, UserRepo userRepo, BCryptPasswordEncoder passwordEncoder) {
		super();
		this.repo = repo;
		this.userRepo = userRepo;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public void deleteCustomerByID(Long id) {
		
	}

	@Override
	public User saveCustomer(User admin) {
		String password = passwordEncoder.encode(admin.getPassword());
		admin.setPassword(password);
		admin.setRole("ROLE_USER");
		return userRepo.save(admin);
	}

//	@Override
//	public User getCustomerById(Long id) {
//		return userRepo.findById(id).get();
//	}
//
//	@Override
//	public User updaCustomer(User admin) {
//		return userRepo.save(admin);
//	}


}
