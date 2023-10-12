package com.example.demo.service;

import java.util.List;
import com.example.demo.model.User;



public interface adminService {
	
	
	List<User> getAllAdmins();
	
	User saveAdmin(User admin);
	
	User getAdminById(Long id);
	User updaAdmin(User admin);
	
	void deleteAdminByID(Long id);

}
