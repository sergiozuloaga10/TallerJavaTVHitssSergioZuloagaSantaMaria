package com.hitss.springboot.apprest_crud_swagger.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hitss.springboot.apprest_crud_swagger.models.Role;
import com.hitss.springboot.apprest_crud_swagger.models.User;
import com.hitss.springboot.apprest_crud_swagger.repositories.RoleRepository;
import com.hitss.springboot.apprest_crud_swagger.repositories.UserRepository;
import com.hitss.springboot.apprest_crud_swagger.services.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional(readOnly = true)
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        List<Role> roles = new ArrayList<>();
        Optional<Role> optionalRole = roleRepository.findByName("ROLE_USER");
        
        optionalRole.ifPresent(roles::add);

        if(user.isAdmin()){
            Optional<Role> optional = roleRepository.findByName("ROLE_ADMIN");
            optional.ifPresent(roles::add);
        }

        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

    @Override
    public boolean existsByUsername(String username) {
        // TODO Auto-generated method stub
        return userRepository.existsByUsername(username);
    }

    
    
}
