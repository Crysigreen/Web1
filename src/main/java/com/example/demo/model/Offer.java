package com.example.demo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.Year;

@Entity
@Table(name = "offer")
public class Offer extends BaseEntity2{
//    @Column(name = "description")
    private String description;
//    @Column(name = "engine")
    private Enums.Engine engine;
//    @Column(name = "imageurl")
    private String imageurl;
//    @Column(name = "mileage")
    private Long mileage;
//    @Column(name = "price")
    private BigDecimal price;
//    @Column(name = "transmission")
    private Enums.Transmission transmission;
//    @Column(name = "year")
    private Year year;
//    @ManyToOne
//    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;
//    @ManyToOne
//    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User seller;



    public Offer() {
    }

//    public Offer(String description, Enums.Engine engine, String imageurl, Long mileage, BigDecimal price, Enums.Transmission transmission, Year year, Model model, User seller) {
//        this.description = description;
//        this.engine = engine;
//        this.imageurl = imageurl;
//        this.mileage = mileage;
//        this.price = price;
//        this.transmission = transmission;
//        this.year = year;
//        this.model = model;
//        this.seller = seller;
//    }


    //Getters and Setters
    @Column(name = "description")
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "imageurl")
    public String getImageurl() {
        return this.imageurl;
    }
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
    @Column(name = "mileage")
    public Long getMileage() {
        return this.mileage;
    }
    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }
    @Column(name = "price")
    public BigDecimal getPrice() {
        return this.price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    @Column(name = "engine")
    public Enums.Engine getEngine() {
        return engine;
    }
    public void setEngine(Enums.Engine engine) {
        this.engine = engine;
    }
    @Column(name = "transmission")
    public Enums.Transmission getTransmission() {
        return transmission;
    }
    public void setTransmission(Enums.Transmission transmission) {
        this.transmission = transmission;
    }
    @Column(name = "year")
    public Year getYear() {
        return this.year;
    }
    public void setYear(Year year) {
        this.year = year;
    }
    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    public User getSeller() {
        return seller;
    }
    public void setSeller(User seller) {
        this.seller = seller;
    }


}
