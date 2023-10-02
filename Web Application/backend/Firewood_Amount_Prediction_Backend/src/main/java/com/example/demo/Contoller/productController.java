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

import com.example.demo.Model.Product;
import com.example.demo.Service.productService;

@RestController
@RequestMapping("/api/v1/pro/")
@CrossOrigin

public class productController {
	
	@Autowired
	private productService service;
	
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	} 
	
	@GetMapping("/getAllProduct")
	public List<Product> getAll(){
		return service.getAllProducts();
	}
	
	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable Long id) {
		return service.getProductById(id);
	}
	
	@PutMapping("/getProduct/{id}")
	public Product deleteProduct(@PathVariable Long id, @RequestBody Product product) {
		return service.updateProduct(id, product);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	// Delete User by ID
	public String deleteProduct(@PathVariable Long id) {
		service.deleteProduct(id);
		return "Product Deleted Successfully!!!";
	}
	

}
