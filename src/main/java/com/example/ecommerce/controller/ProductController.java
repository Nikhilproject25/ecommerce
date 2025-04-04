package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
   @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }
    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
}
