package com.hitss.springboot.dependencia_app.repositories.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.hitss.springboot.dependencia_app.models.Product;
import com.hitss.springboot.dependencia_app.repositories.ProductRepository;

//@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> products;

    public ProductRepositoryImpl() {
        this.products = List.of(
            new Product(1L, "Memoria Corsair 32GB", 750),
            new Product(2L, "CPU Intel Core i9", 2750),
            new Product(3L, "Teclado Razer Mini 0%", 1250),
            new Product(4L, "Motherboard Gigabyte", 3550),
            new Product(5L, "Disco Duro Toshiba 2TB", 1750)
        );
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return products;
    }

    @Override
    public Product findById(Long id) {
        // TODO Auto-generated method stub
        return products.stream().filter(p -> p.getId().equals(id))
                        .findFirst()
                        .orElse(null);
    }
    
}
