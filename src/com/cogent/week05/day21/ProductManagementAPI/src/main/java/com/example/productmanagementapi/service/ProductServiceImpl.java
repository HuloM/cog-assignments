package com.example.productmanagementapi.service;

import com.example.productmanagementapi.entity.Product;
import com.example.productmanagementapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> fetchProducts() {
        return (List<Product>) productRepository.findAll();
    }
}
