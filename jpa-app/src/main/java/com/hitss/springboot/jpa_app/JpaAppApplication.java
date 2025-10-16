package com.hitss.springboot.jpa_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaAppApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Spring Boot");
	}

}
