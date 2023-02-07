package com.example.springsecurityexercise.controller;

import com.example.springsecurityexercise.entity.Product;
import com.example.springsecurityexercise.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/fetchAll")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
    @GetMapping("/fetchById/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.findById(id);
    }
    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.save(product);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.update(product);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
