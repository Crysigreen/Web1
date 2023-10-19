package com.example.demo.dtos;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;


public class RoleDto {

    private LocalDateTime created;
    private LocalDateTime modified;
    private UUID id;
    private String role;
    private Boolean isDeleted;

    public RoleDto() {
    }

    public RoleDto(LocalDateTime created, LocalDateTime modified, UUID id, String role, Boolean isDeleted) {
        this.created = created;
        this.modified = modified;
        this.id = id;
        this.role = role;
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getCreated() {
        return this.created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return this.modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
