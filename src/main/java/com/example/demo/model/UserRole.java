package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "user_role")
public class UserRole extends BaseEntity {
    private Enums.Role name;
    public UserRole(Enums.Role name) {
        this.name = name;
    }
    public UserRole() {
    }

    //Getters and Setters
    @Enumerated(EnumType.STRING)
    @Column(name = "role", unique = true)
    public Enums.Role getName() {
        return name;
    }

    public void setName(Enums.Role name) {
        this.name = name;
    }
}
