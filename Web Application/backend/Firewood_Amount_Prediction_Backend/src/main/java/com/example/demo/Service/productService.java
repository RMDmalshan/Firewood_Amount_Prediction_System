package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Product;
import com.example.demo.Repository.productRepo;

@Service
public class productService {
	
	@Autowired
	private productRepo repo;
	
	//Save product
	public Product saveProduct(Product product) {
		return repo.save(product);
	}
	
	//Get all Product
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
	
	// Get Product By ID
	public Product getProductById(Long id) {
		return repo.findById(id).get();
	}
	
	// Update Product
	public Product updateProduct(Long id, Product product) {
		Product product1 = repo.findById(id).get();
		product1.setName(product.getName());
		product1.setDescription(product.getDescription());
		product1.setPrice(product.getPrice());
		product1.setCategory(product.getCategory());
		

		return repo.save(product1);
	}
	
	
	//Delete Product
		public void deleteProduct(Long id) {
			repo.deleteById(id);
		}

}
