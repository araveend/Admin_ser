package com.auth.sec.admin.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.auth.sec.admin.entity.User;
import com.auth.sec.admin.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class StartupDataLoader {

	private final PasswordEncoder p;
	
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            if (userRepository.count() == 0) {
            	List<String> roles =new ArrayList<String>();
            	
            	roles.add("ADMIN");
                User user = new User();
                user.setId(001l);
                user.setFirstName("Admin");
                user.setLastName("User");
                user.setPassword(p.encode("test"));
                user.setRoles(roles);
                user.setEmail("admin@example.com");

                userRepository.save(user);
                System.out.println("Default user inserted on startup.");
            }
        };
    }
}
