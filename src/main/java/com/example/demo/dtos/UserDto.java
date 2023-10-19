package com.example.demo.dtos;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

public class UserDto {

    private LocalDateTime created;
    private Boolean isActive;
    private LocalDateTime modified;
    private UUID id;
    private String firstName;
    private String imageurl;
    private String lastName;
    private String password;
    private RoleDto role;
    private String username;
    private Boolean isDeleted;

    public UserDto() {
    }

    public UserDto(LocalDateTime created, Boolean isActive, LocalDateTime modified, UUID id, String firstName, String imageurl, String lastName, String password, RoleDto role, String username, Boolean isDeleted) {
        this.created = created;
        this.isActive = isActive;
        this.modified = modified;
        this.id = id;
        this.firstName = firstName;
        this.imageurl = imageurl;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
        this.username = username;
        this.isDeleted = isDeleted;
    }


    //Getters and Setters

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleDto getRole() {
        return this.role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
