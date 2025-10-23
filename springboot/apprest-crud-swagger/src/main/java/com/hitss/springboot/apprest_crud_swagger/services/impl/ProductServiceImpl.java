package com.hitss.springboot.apprest_crud_swagger.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hitss.springboot.apprest_crud_swagger.models.Product;
import com.hitss.springboot.apprest_crud_swagger.repositories.ProductRepository;
import com.hitss.springboot.apprest_crud_swagger.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return productRepository.findAll();
    }
    
    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        // TODO Auto-generated method stub
        return productRepository.findById(id);
    }
    
    @Transactional
    @Override
    public Product save(Product product) {
        // TODO Auto-generated method stub
        return productRepository.save(product);
    }
    
    @Transactional
    @Override
    public Optional<Product> update(Long id, Product product) {
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()) {
            Product productDb = optional.orElseThrow();
            productDb.setName(product.getName());
            productDb.setDescription(product.getDescription());
            productDb.setPrice(product.getPrice());

            return Optional.of(productRepository.save(productDb));
        }

        return optional;
    }

    @Override
    public Optional<Product> delete(Long id) {
        Optional<Product> optional = productRepository.findById(id);
        optional.ifPresent(p -> productRepository.delete(p));
        return optional;
    }

}
