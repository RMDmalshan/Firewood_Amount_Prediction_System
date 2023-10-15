package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;


@SpringBootTest
public class UsersUnitTesing {

	@Autowired
	UserRepo userRepo;

	@Test
	public void testSaveUser() {
	    User user = new User();
	    user.setId(2L);
	    user.setName("Ravindu");
	    user.setNic("200021100038");
	    user.setAddress("kuliyapitiya");
	    user.setNumber("0768636041");
	    user.setEmail("ravi@gmail.com");
	    user.setPassword("ravi123");
	    userRepo.save(user);
		assertNotNull(userRepo.findById(2L).get());
	}

	@Test
	public void testAllData() {
		List<User> list1 = userRepo.findAll();
		assertThat(list1).size().isGreaterThan(0);
	}
	
	
	@Test
	public void testUpdateUser() {
		User user = userRepo.findById(2L).get();
		user.setEmail("ravi1@gmail.com");
		userRepo.save(user);
		assertNotEquals("ravi@gmail.com", userRepo.findById(2L).get().getEmail());
	}

	@Test
	public void testDelete() {
		userRepo.deleteById(1L);
		assertThat(userRepo.existsById(1L)).isFalse();
	}
	
	
	
}
