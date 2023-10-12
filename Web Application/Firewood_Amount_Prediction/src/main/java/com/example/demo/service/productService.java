package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface productService {

	List<Product> getAllProducts();

	Product saveProduct(Product product);

	Product getProductById(Long id);

	Product updaProduct(Product product);

	void deleteProductByID(Long id);
}
