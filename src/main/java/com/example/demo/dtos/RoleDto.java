package com.example.demo.dtos;

import com.example.demo.model.Enums;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;


public class RoleDto {

    private UUID id;
    private Enums.Role role;
    private Boolean isDeleted;

    public RoleDto() {
    }

    public RoleDto(UUID id, Enums.Role role, Boolean isDeleted) {
        this.id = id;
        this.role = role;
        this.isDeleted = isDeleted;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Enums.Role getRole() {
        return role;
    }

    public void setRole(Enums.Role role) {
        this.role = role;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
