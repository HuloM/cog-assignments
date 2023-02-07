package com.example.onetooneexcersize.repository;

import com.example.onetooneexcersize.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
