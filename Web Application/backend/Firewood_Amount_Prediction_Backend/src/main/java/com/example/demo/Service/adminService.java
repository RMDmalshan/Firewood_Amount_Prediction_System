package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Admin;

import com.example.demo.Repository.adminRepo;


@Service
public class adminService {
	
	
	@Autowired
	private adminRepo repo;

	// Save Admin
	public Admin saveAdmin(Admin admin) {
		return repo.save(admin);
	}

	// Get All Admin
	public List<Admin> getAllAdmins() {
		return repo.findAll();
	}

	// Get Admin By ID
	public Admin getAdminById(Long id) {
		return repo.findById(id).get();
	}

	// Update Admin
	public Admin updateUser(Long id, Admin admin) {
		Admin admin2 = repo.findById(id).get();
		admin2.setName(admin.getName());
		admin2.setNic(admin.getNic());
		admin2.setAddress(admin.getAddress());
		admin2.setNumber(admin.getNumber());
		admin2.setUserName(admin.getUserName());
		admin2.setPassword(admin.getPassword());

		return repo.save(admin2);
	}
	
	//Delete Admin
	public void deleteAdmin(Long id) {
		repo.deleteById(id);
	}

}
