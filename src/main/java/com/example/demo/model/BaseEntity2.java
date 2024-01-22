package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;


@MappedSuperclass
public abstract class BaseEntity2 extends BaseEntity {

    private LocalDateTime created;
    private LocalDateTime modified;

    public BaseEntity2() {
    }

    @Column(name = "created")
    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Column(name = "modified")
    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

}
