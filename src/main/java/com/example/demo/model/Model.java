package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "model")
public class Model extends BaseEntity2{

    @Column(name = "name")
    private String name;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "category")
    private Enums.Category category;
    @Column(name = "imageurl")
    private String imageurl;
    @Column(name = "startyear")
    private LocalDateTime startyear;
    @Column(name = "endyear")
    private LocalDateTime endyear;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;


    public Model() {
    }

    public Model(String name, Enums.Category category, String imageurl, LocalDateTime startyear, LocalDateTime endyear, Brand brand) {
        this.name = name;
        this.category = category;
        this.imageurl = imageurl;
        this.startyear = startyear;
        this.endyear = endyear;
        this.brand = brand;
    }

    //Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enums.Category getCategory() {
        return category;
    }

    public void setCategory(Enums.Category category) {
        this.category = category;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public LocalDateTime getStartyear() {
        return this.startyear;
    }

    public void setStartyear(LocalDateTime startyear) {
        this.startyear = startyear;
    }

    public LocalDateTime getEndyear() {
        return this.endyear;
    }

    public void setEndyear(LocalDateTime endyear) {
        this.endyear = endyear;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
