package com.bikebuka.smarthr.core.bootstrap;

import com.bikebuka.smarthr.core.models.ERole;
import com.bikebuka.smarthr.core.models.Role;
import com.bikebuka.smarthr.core.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Bootstrap implements CommandLineRunner {
    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        Role admin = new Role(1, ERole.ROLE_ADMIN);
        Role mod = new Role(2, ERole.ROLE_EMPLOYEE);
        Role user = new Role(3, ERole.ROLE_USER);
        roleRepository.save(admin);
        roleRepository.save(mod);
        roleRepository.save(user);

    }
}
