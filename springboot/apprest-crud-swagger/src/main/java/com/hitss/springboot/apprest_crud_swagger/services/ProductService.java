package com.hitss.springboot.apprest_crud_swagger.services;

import java.util.List;
import java.util.Optional;

import com.hitss.springboot.apprest_crud_swagger.models.Product;

public interface ProductService {
    
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Optional<Product> update(Long id, Product product);
    Optional<Product> delete(Long id);

} 
