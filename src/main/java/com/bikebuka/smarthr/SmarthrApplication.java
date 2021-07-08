package com.bikebuka.smarthr;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class SmarthrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmarthrApplication.class, args);
    }

}
