package com.hitss.springboot.apprest_crud_swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                    .info(
                        new Info()
                            .title("Product API")
                            .version("1.0.0")
                            .description("API documentation for Product built with Spring Boot 3.5.7")
                    );
    }
}
