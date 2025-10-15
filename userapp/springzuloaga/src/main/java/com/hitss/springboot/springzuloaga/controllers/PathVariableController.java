package com.hitss.springboot.springzuloaga.controllers;

import java.util.HashMap;
import java.util.Map;

//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitss.springboot.springzuloaga.models.User;
import com.hitss.springboot.springzuloaga.models.dto.ParamDto;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("(/baz/{message})")
    public ParamDto baz(@PathVariable String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{message}/{id}")
    public Map<String, Object> mixVariables(
            @PathVariable String name,
            @PathVariable Long id
        ) {
        Map<String, Object> json = new HashMap<>();
        json.put("name", name);
        json.put("id", id);
        
        return json;
    }

    @PostMapping("path")
    public User createUser(@RequestBody User user) {
        //Hacer algo con el usuario -> Guardar en la BD
        user.setName(user.getName().toUpperCase());
        user.setLastname(user.getLastname().toUpperCase());
        
        return user;
    }
    
    
}
