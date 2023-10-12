package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.repository.adminRepo;

@Service
public class adminServiceImpl implements adminService {

	private adminRepo repo;
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	

	public adminServiceImpl(adminRepo repo, UserRepo userRepo) {
		super();
		this.repo = repo;
		this.userRepo = userRepo;
	}

	@Override
	public List<User> getAllAdmins() {
		return userRepo.findAll();
	}

	@Override
	public User saveAdmin(User admin) {
		String password = passwordEncoder.encode(admin.getPassword());
		admin.setPassword(password);
		admin.setRole("ROLE_ADMIN");
		return userRepo.save(admin);
	}

	@Override
	public User getAdminById(Long id) {
		return userRepo.findById(id).get();
	}

	@Override
	public User updaAdmin(User admin) {
		return userRepo.save(admin);
	}

	@Override
	public void deleteAdminByID(Long id) {
		userRepo.deleteById(id);
		
	}
}
