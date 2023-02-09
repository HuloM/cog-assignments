package com.example.springsecurityjwtdemo.repository;

import com.example.springsecurityjwtdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
