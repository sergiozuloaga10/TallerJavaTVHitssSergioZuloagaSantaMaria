package com.hitss.springboot.dependencia_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitss.springboot.dependencia_app.models.Product;
import com.hitss.springboot.dependencia_app.services.ProductService;
import com.hitss.springboot.dependencia_app.services.impl.ProductServiceImpl;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    //private ProductService service = new ProductServiceImpl();
    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> listProducts(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product showProduct(@PathVariable Long id) {
        return service.findById(id);
    }

}
