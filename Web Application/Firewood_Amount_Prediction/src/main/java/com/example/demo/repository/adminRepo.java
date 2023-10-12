package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;


public interface adminRepo extends JpaRepository<User, Long>{

}

