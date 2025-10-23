package com.hitss.springboot.apprest_crud_swagger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.apprest_crud_swagger.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
