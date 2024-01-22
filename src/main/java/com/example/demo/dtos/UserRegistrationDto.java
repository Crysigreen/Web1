package com.example.demo.dtos;

import jakarta.validation.constraints.*;

public class UserRegistrationDto {

    private String username;
    private String lastname;
    private String firstname;
    private String password;
    private String confirmPassword;

    public UserRegistrationDto() {}

    @NotEmpty(message = "User name cannot be null or empty!")
    @Size(min = 5, max = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotEmpty(message = "Lastname cannot be null or empty!")
    @Size(min = 2, max = 20)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @NotEmpty(message = "Firstname cannot be null or empty!")
    @Size(min = 2, max = 20)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @NotEmpty(message = "Password cannot be null or empty!")
    @Size(min = 5, max = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @NotEmpty(message = "Confirm Password cannot be null or empty!")
    @Size(min = 5, max = 20)
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "UserRegistrationDTO{" +
                "username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
