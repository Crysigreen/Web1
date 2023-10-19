package com.example.demo.dtos;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.UUID;


public class OfferDto {

    private LocalDateTime created;
    private LocalDateTime modified;
    private BigDecimal price;
    private Year year;
    private UUID id;
    private Long mileage;
    private String description;
    private String engine;
    private String imageurl;
    private ModelDto model;
    private UserDto seller;
    private String transmission;
    private Boolean isDeleted;

    public OfferDto() {
    }

    public OfferDto(LocalDateTime created, LocalDateTime modified, BigDecimal price, Year year, UUID id, Long mileage, String description, String engine, String imageurl, ModelDto model, UserDto seller, String transmission, Boolean isDeleted) {
        this.created = created;
        this.modified = modified;
        this.price = price;
        this.year = year;
        this.id = id;
        this.mileage = mileage;
        this.description = description;
        this.engine = engine;
        this.imageurl = imageurl;
        this.model = model;
        this.seller = seller;
        this.transmission = transmission;
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

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Year getYear() {
        return this.year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getMileage() {
        return this.mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public ModelDto getModel() {
        return this.model;
    }

    public void setModel(ModelDto model) {
        this.model = model;
    }

    public UserDto getSeller() {
        return this.seller;
    }

    public void setSeller(UserDto seller) {
        this.seller = seller;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
