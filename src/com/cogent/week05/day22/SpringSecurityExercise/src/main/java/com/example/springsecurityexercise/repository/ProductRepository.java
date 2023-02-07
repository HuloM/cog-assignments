package com.example.springsecurityexercise.repository;

import com.example.springsecurityexercise.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
