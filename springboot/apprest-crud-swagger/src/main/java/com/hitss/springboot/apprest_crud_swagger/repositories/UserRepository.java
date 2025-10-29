package com.hitss.springboot.apprest_crud_swagger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.apprest_crud_swagger.models.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);
    
    boolean existsByUsername(String username);
}
