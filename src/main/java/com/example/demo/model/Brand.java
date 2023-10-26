package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "brand")
public class Brand extends BaseEntity2{

    @Column(name = "name")
    private String name;


    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }


    //Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
