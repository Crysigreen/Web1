package com.example.demo.dtos;

import com.example.demo.model.Enums;

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
    private Enums.Engine engine;
    private String imageurl;
    private UUID model;
    private UUID seller;
    private Enums.Transmission transmission;
    private Boolean isDeleted;

    public OfferDto() {
    }

    public OfferDto(LocalDateTime created, LocalDateTime modified, BigDecimal price, Year year, UUID id, Long mileage, String description, Enums.Engine engine, String imageurl, UUID model, UUID seller, Enums.Transmission transmission, Boolean isDeleted) {
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

    public Enums.Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Enums.Engine engine) {
        this.engine = engine;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public UUID getModel() {
        return this.model;
    }

    public void setModel(UUID model) {
        this.model = model;
    }

    public UUID getSeller() {
        return this.seller;
    }

    public void setSeller(UUID seller) {
        this.seller = seller;
    }

    public Enums.Transmission getTransmission() {
        return this.transmission;
    }

    public void setTransmission(Enums.Transmission transmission) {
        this.transmission = transmission;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
