package com.example.lombokjpademo.service;

import com.example.lombokjpademo.entity.Employee;
import com.example.lombokjpademo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }
}
