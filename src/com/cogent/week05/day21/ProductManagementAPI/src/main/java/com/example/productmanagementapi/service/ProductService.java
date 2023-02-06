package com.example.productmanagementapi.service;

import com.example.productmanagementapi.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> fetchProducts();
}
