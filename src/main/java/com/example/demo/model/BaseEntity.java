package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity  {

    protected UUID id;
    //@Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;

//    public BaseEntity() {
//    }

//    public BaseEntity(UUID id, Boolean isDeleted) {
//        this.id = id;
//        this.isDeleted = isDeleted;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "is_deleted", nullable = false)
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        this.isDeleted = deleted;
    }
}
