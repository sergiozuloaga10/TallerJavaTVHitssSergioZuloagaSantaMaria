package com.hitss.springboot.jpa_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.jpa_app.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
