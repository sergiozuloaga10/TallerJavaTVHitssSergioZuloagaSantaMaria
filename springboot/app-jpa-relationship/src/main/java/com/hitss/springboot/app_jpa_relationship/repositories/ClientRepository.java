package com.hitss.springboot.app_jpa_relationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.app_jpa_relationship.ENTITIES.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
