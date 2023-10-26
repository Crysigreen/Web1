package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "user_role")
public class UserRole extends BaseEntity {
    @Column(name = "role")
    private Enums.Role role;
    public UserRole() {
    }

    public UserRole(Enums.Role role) {
        this.role = role;
    }

    //Getters and Setters

    public Enums.Role getRole() {
        return role;
    }

    public void setRole(Enums.Role role) {
        this.role = role;
    }
}
