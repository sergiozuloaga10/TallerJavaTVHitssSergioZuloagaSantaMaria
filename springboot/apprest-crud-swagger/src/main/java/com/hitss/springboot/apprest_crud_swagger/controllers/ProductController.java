package com.hitss.springboot.apprest_crud_swagger.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitss.springboot.apprest_crud_swagger.models.Product;
import com.hitss.springboot.apprest_crud_swagger.services.ProductService;
import com.hitss.springboot.apprest_crud_swagger.utils.Util;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
@Tag(
    name = "Products",
    description = "Endpoints for managing products within the store. Includes operations for listin, creating, updating and deleting products"
)
public class ProductController {

    @Autowired
    private ProductService productService;

    @Operation(
        summary = "Get all products",
        description = "Retrieves all registred products"
    )
    @GetMapping
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Long id){
        Optional<Product> optionalProduct = productService.findById(id);
        if(optionalProduct.isPresent()){
            return ResponseEntity.ok(optionalProduct.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/psuccess")
    public ResponseEntity<?> create(@Valid @RequestBody Product product, 
                    BindingResult result){
        if(result.hasFieldErrors()){
            return Util.validation(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED)
                            .body(productService.save(product));
    }

    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @Valid BindingResult result,
                     @RequestBody Product product){
        if(result.hasFieldErrors()){
            return Util.validation(result);
        }
        Optional<Product> optional = productService.update(id, product);
        if(optional.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(optional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id, @RequestBody Product product){
        Optional<Product> optional = productService.delete(id);
        if(optional.isPresent()){
            return ResponseEntity.ok(optional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
    
    
}
