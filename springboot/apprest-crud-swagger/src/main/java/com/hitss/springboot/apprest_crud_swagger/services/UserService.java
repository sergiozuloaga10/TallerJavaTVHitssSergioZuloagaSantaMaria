package com.hitss.springboot.apprest_crud_swagger.services;

import java.util.List;
import java.util.Optional;

import com.hitss.springboot.apprest_crud_swagger.models.User;

public interface UserService {
    List<User> findAll();
    User save(User user);

    boolean existsByUsername(String username);
}
