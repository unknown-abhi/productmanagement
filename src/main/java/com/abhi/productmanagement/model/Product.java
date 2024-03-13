package com.abhi.productmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String type;

    private String place;

    private int warranty;

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + ", warranty=" + warranty + "]";
    }
}
