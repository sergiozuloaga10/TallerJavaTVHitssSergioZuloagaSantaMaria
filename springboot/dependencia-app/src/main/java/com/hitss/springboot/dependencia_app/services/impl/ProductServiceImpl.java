package com.hitss.springboot.dependencia_app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.springboot.dependencia_app.models.Product;
import com.hitss.springboot.dependencia_app.repositories.ProductRepository;
import com.hitss.springboot.dependencia_app.repositories.impl.ProductRepositoryImpl;
import com.hitss.springboot.dependencia_app.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    //Inyección de dependencia -> atributo, metodo set, constructor

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream()
                                    .map(p -> {
                                        Double priceTax = p.getPrice() * 1.45;
                                        //Product newProduct = new Product(p.getId(), p.getName(), priceTax);
                                        Product newProduct = (Product) p.clone();
                                        newProduct.setPrice(priceTax);
                                        return newProduct;
                                    })
                                    .toList();
    }

    @Override
    public Product findById(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id);
    }

}
