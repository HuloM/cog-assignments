package com.example.onetooneexercisep2.repository;

import com.example.onetooneexercisep2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
