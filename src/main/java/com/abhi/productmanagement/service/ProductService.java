package com.abhi.productmanagement.service;

import com.abhi.productmanagement.dao.ProductDB;
import com.abhi.productmanagement.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductDB productDB;
    public List<Product> getAllProducts() {
        return productDB.findAll();
    }

    public Product getProductByName(String name) {
        return productDB.findByName(name);
    }

    public void addProduct(Product product) {
        productDB.save(product);
    }
}
