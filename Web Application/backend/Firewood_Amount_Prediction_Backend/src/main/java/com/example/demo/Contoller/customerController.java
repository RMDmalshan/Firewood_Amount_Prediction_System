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

import com.example.demo.Model.Customer;
import com.example.demo.Service.customerService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class customerController {
	
	@Autowired
	private customerService service;
	
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomers(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	} 
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAll(){
		return service.getAllCustomers();
	}
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		return service.getCustomerById(id);
	}
	
	@PutMapping("/getCustomer/{id}")
	public Customer deleteCustomer(@PathVariable Long id, @RequestBody Customer customer) {
		return service.updateUser(id, customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	// Delete User by ID
	public String deleteCustomer(@PathVariable Long id) {
		service.deleteCustomer(id);
		return "User Deleted Successfully!!!";
	}

}
