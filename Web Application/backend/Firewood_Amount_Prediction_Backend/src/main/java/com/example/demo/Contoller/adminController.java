package com.example.demo.Contoller;

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

import com.example.demo.Model.Admin;
import com.example.demo.Model.Customer;
import com.example.demo.Service.adminService;
import com.example.demo.Service.customerService;

@RestController
@RequestMapping("/api/v1/adm/")
@CrossOrigin

public class adminController {
	
	
	@Autowired
	private adminService service;
	
	
	@PostMapping("/saveAdmin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return service.saveAdmin(admin);
	} 
	
	@GetMapping("/getAllAdmin")
	public List<Admin> getAll(){
		return service.getAllAdmins();
	}
	
	@GetMapping("/getAdmin/{id}")
	public Admin getAdminById(@PathVariable Long id) {
		return service.getAdminById(id);
	}
	
	@PutMapping("/getAdmin/{id}")
	public Admin deleteAdmin(@PathVariable Long id, @RequestBody Admin admin) {
		return service.updateUser(id, admin);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	// Delete User by ID
	public String deleteAdmin(@PathVariable Long id) {
		service.deleteAdmin(id);
		return "User Deleted Successfully!!!";
	}

}
