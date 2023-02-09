package com.example.onetooneexercisep2.repository;

import com.example.onetooneexercisep2.entity.EmployeeContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeContactRepository extends JpaRepository<EmployeeContact, Integer> {
}
