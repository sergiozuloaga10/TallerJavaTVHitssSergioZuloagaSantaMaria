package com.hitss.springboot.app_jpa_relationship.ENTITIES;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "invoices")
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Invoice(String description, Double precio) {
        this.description = description;
        this.precio = precio;
    }
    
}
