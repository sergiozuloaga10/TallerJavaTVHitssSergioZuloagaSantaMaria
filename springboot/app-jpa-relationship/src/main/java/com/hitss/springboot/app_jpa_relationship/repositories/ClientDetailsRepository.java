package com.hitss.springboot.app_jpa_relationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.app_jpa_relationship.ENTITIES.ClientDetails;

public interface ClientDetailsRepository extends JpaRepository<ClientDetails, Long> {

}
