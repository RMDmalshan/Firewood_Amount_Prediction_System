package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.repository.productRepo;

@SpringBootTest
public class ProductUnitTesting {

	@Autowired
	productRepo productRepo;

	@Test
	public void testSaveUser() {
	    Product product = new Product();
	    product.setId(1L);
	    product.setName("Coconut oil");
	    product.setDescription("Oil");
	    product.setPrice("2000");
	    product.setCategory("Oil");
	    productRepo.save(product);
		assertNotNull(productRepo.findById(1L).get());
	}

	@Test
	public void testAllData() {
		List<Product> list1 = productRepo.findAll();
		assertThat(list1).size().isGreaterThan(0);
	}
	
	
	@Test
	public void testUpdateUser() {
		Product product = productRepo.findById(1L).get();
		product.setPrice("2500");
		productRepo.save(product);
		assertNotEquals("2000", productRepo.findById(1L).get().getPrice());
	}

	@Test
	public void testDelete() {
		productRepo.deleteById(2L);
		assertThat(productRepo.existsById(2L)).isFalse();
	}
}
