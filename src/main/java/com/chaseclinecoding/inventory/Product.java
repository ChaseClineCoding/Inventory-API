package com.chaseclinecoding.inventory;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Product {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;
    private BigDecimal price;

    private Product() {}

    public Product(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
