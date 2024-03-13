package com.abhi.productmanagement.dao;

import com.abhi.productmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDB extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
