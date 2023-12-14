package com.example.demo.services.implement;

import com.example.demo.dtos.UserRegistrationDto;
import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.UserRoleRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.demo.model.Enums.Role;



import java.util.List;
import java.util.Optional;

@Service
public class AuthService {

    private UserRepository userRepository;

    private UserRoleRepository userRoleRepository;


    private PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, UserRoleRepository userRoleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userRoleRepository = userRoleRepository;
    }

    public void register(UserRegistrationDto registrationDTO) {
        if (!registrationDTO.getPassword().equals(registrationDTO.getConfirmPassword())) {
            throw new RuntimeException("passwords.match");
        }

        Optional<User> byUsername = this.userRepository.findByUsername(registrationDTO.getUsername());

        if (byUsername.isPresent()) {
            throw new RuntimeException("Username is already taken!");
        }

        var userRole = userRoleRepository.
                findByName(Role.User).orElseThrow();

        User user = new User(
                registrationDTO.getUsername(),
                passwordEncoder.encode(registrationDTO.getPassword()),
                registrationDTO.getFirstname(),
                registrationDTO.getLastname(),
                true
        );


        user.setRoles(List.of(userRole));

        this.userRepository.save(user);
    }

    public User getUser(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(username + " was not found!"));
    }
}
