package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "model")
public class Model extends BaseEntity2{

    //@Column(name = "name")
    private String name;
//    @Enumerated(EnumType.ORDINAL)
//    @Column(name = "category")
    private Enums.Category category;
    //@Column(name = "imageurl")
    private String imageurl;
    //@Column(name = "startyear")
    private int startyear;
//    @Column(name = "endyear")
    private int endyear;
//    @ManyToOne
//    @JoinColumn(name = "brand_id")
    private Brand brand;


    public Model() {
    }

//    public Model(String name, Enums.Category category, String imageurl, LocalDateTime startyear, LocalDateTime endyear, Brand brand) {
//        this.name = name;
//        this.category = category;
//        this.imageurl = imageurl;
//        this.startyear = startyear;
//        this.endyear = endyear;
//        this.brand = brand;
//    }

    //Getters and Setters
    @Column(name = "name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "category")
    public Enums.Category getCategory() {
        return category;
    }

    public void setCategory(Enums.Category category) {
        this.category = category;
    }

    @Column(name = "imageurl")
    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Column(name = "startyear")
    public int getStartyear() {
        return this.startyear;
    }

    public void setStartyear(int startyear) {
        this.startyear = startyear;
    }

    @Column(name = "endyear")
    public int getEndyear() {
        return this.endyear;
    }

    public void setEndyear(int endyear) {
        this.endyear = endyear;
    }

    @ManyToOne
    @JoinColumn(name = "brand_id")
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
