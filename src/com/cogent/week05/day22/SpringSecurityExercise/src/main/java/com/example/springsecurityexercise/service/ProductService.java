package com.example.springsecurityexercise.service;

import com.example.springsecurityexercise.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    Product findById(Long id);
    void deleteById(Long id);
    List<Product> findAll();
    Product update(Product product);

}
