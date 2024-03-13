package com.abhi.productmanagement.controller;

import com.abhi.productmanagement.model.Product;
import com.abhi.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService  productService;
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
}
