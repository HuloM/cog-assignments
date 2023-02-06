package com.example.productmanagementapi.controller;

import com.example.productmanagementapi.entity.Product;
import com.example.productmanagementapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/save")
    public Product saveProduct(@Validated @RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping("/fetchAll")
    public List<Product> fetchProducts() {
        return service.fetchProducts();
    }
}
