package com.hitss.springboot.dependencia_app.repositories;

import java.util.List;

import com.hitss.springboot.dependencia_app.models.Product;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);
    
    
} 
