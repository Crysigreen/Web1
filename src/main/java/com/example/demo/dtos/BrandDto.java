package com.example.demo.dtos;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;


public class BrandDto {

    private UUID id;
    private String name;
    private LocalDateTime created;
    private LocalDateTime modified;
    private Boolean isDeleted;


    public BrandDto() {
    }

    public BrandDto(UUID id, String name, LocalDateTime created, LocalDateTime modified, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.modified = modified;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}

