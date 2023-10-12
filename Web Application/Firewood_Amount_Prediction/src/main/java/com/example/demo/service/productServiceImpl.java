package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Product;
import com.example.demo.repository.productRepo;

@Service
public class productServiceImpl implements productService {

	private productRepo repo;

	public productServiceImpl(productRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public Product getProductById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public Product updaProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public void deleteProductByID(Long id) {
		repo.deleteById(id);
	}


}
