package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Customer;

public interface customerRepo extends JpaRepository<Customer, Long>{

}
