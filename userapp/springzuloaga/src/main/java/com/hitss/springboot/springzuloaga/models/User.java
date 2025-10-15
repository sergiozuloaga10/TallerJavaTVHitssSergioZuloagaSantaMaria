package com.hitss.springboot.springzuloaga.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {
    private String name;
    private String lastname;
    private LocalDate birthDate;
    private String email;
}
