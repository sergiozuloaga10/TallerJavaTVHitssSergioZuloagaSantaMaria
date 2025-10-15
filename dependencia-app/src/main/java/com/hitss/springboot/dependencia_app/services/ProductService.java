package com.hitss.springboot.dependencia_app.services;

import java.util.List;

import com.hitss.springboot.dependencia_app.models.Product;

public interface ProductService {
    List<Product> findAll();

    Product findById(Long id);
}
