package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@MappedSuperclass
public abstract class BaseEntity2 extends BaseEntity {

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "modified")
    private LocalDateTime modified;

    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

    public BaseEntity2() {
    }

    public BaseEntity2(LocalDateTime created, LocalDateTime modified, Boolean isDeleted) {
        this.created = created;
        this.modified = modified;
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

}
