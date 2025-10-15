package com.hitss.springboot.springzuloaga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hitss.springboot.springzuloaga.models.dto.ParamDto;
import com.hitss.springboot.springzuloaga.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api/params")
public class RequestParamController {
    
    @GetMapping("/")
    public ParamDto hola(@RequestParam String param) {
        ParamDto dto = new ParamDto();

        return dto;
    }

    @GetMapping("/hola")
    public ParamMixDto request(HttpServletRequest request) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage("null");

        return params;
    }
    
    
}
