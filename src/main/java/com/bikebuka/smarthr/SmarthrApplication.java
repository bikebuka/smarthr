package com.bikebuka.smarthr;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import net.savantly.authorization.configuration.EnableRolePermissions;
import net.savantly.authorization.service.PermissionAwareJwtAuthenticationConverter;
import net.savantly.authorization.service.PermissionProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@OpenAPIDefinition
@SpringBootApplication
public class SmarthrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmarthrApplication.class, args);
    }

}
