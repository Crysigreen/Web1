package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity2{
//    @Column(name = "username")
    private String username;

//    @Column(name = "password")
    private String password;

//    @Column(name = "first_name")
    private String firstname;

//    @Column(name = "last_name")
    private String lastname;

//    @Column(name = "is_active")
    private Boolean isactive;

//    @ManyToOne
//    @JoinColumn(name = "role_id")
    private List<UserRole> roles;

//    @Column(name = "imageurl")
    private String imageurl;


    public User() {
    }

    public User(String username, String password, String firstname, String lastname, Boolean isactive) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.isactive = isactive;

    }


    //Getters and Setters
    @Column(name = "username")
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(name = "password")
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "first_name")
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @Column(name = "last_name")
    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Column(name = "is_active")
    public Boolean getIsactive() {
        return this.isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    @ManyToMany
    @JoinColumn(name = "role_id")
    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roleId) {
        this.roles = roleId;
    }

    @Column(name = "imageurl")
    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

}
