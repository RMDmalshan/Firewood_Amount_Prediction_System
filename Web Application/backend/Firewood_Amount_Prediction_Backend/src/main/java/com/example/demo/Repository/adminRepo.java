package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Admin;

public interface adminRepo extends JpaRepository<Admin, Long>{

}

