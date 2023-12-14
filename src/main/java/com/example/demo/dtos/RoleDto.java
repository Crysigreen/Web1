package com.example.demo.dtos;

import com.example.demo.model.Enums;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;


public class RoleDto {


    private Enums.Role role;


    public RoleDto() {
    }

    public RoleDto(UUID id, Enums.Role role, Boolean isDeleted) {

        this.role = role;

    }



    public Enums.Role getRole() {
        return role;
    }

    public void setRole(Enums.Role role) {
        this.role = role;
    }


}
