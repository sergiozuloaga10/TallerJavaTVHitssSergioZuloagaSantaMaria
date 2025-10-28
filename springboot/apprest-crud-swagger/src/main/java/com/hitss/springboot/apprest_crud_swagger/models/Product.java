package com.hitss.springboot.apprest_crud_swagger.models;

import com.hitss.springboot.apprest_crud_swagger.validation.IsRequired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    //@NotBlank
    @IsRequired(message = "{IsRequired.product.name}")
    @Size(min = 3)
    private String name;
    
    @Column(length = 100, nullable = false)
    @NotNull   
    @Min(0)
    private Integer price;

    private String description;
}
