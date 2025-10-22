package com.hitss.springboot.app_jpa_relationship.ENTITIES;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {

    //ManyToOne -> Muchas facturas -> Cliente
    //OneToMany -> Cliente -> Muchas direcciones

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String lastName;

    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "clients_addresses",
        joinColumns = @JoinColumn(name = "client_id"),
        inverseJoinColumns = @JoinColumn(name = "addresses_id"),
        uniqueConstraints = @UniqueConstraint(columnNames = {"addresses_id"})
    )
    private List<Address> addresses;

    @OneToOne(fetch = FetchType.LAZY)
    private ClientDetails clientDetails;
    
}
