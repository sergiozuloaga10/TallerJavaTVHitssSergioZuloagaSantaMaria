package com.hitss.springboot.dependencia_app.repositories.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hitss.springboot.dependencia_app.models.Product;
import com.hitss.springboot.dependencia_app.repositories.ProductRepository;

@Repository("product.json")
public class ProductRepositoryJson implements ProductRepository{

    private List<Product> data;

    public ProductRepositoryJson() {
        Resource resource = new ClassPathResource("json/products.json");
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return data;
    }

    @Override
    public Product findById(Long id) {
        // TODO Auto-generated method stub
        return data.stream()
                    .filter(p -> p.getId().equals(id))
                    .findFirst()
                    .orElseThrow();
    }

    private void readValueJson(Resource resource){
        ObjectMapper  mapper = new ObjectMapper();
        try {
            data = Arrays.asList(mapper.readValue(resource.getInputStream(), Product[].class));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
