package com.hitss.springboot.app_jpa_relationship.ENTITIES;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clients_details")
@NoArgsConstructor
@Data
public class ClientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean premium;
    private Integer points;
    public ClientDetails(boolean premium, Integer points) {
        this.premium = premium;
        this.points = points;
    }

    
}
