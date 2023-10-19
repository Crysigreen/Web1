package com.example.demo.dtos;

import com.example.demo.model.Enums;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;


public class ModelDto {

    private UUID id;
    private String name;
    private LocalDateTime endyear;
    private LocalDateTime startyear;
    private BrandDto brand;
    private Enums.Category category;
    private String imageurl;
    private LocalDateTime created;
    private LocalDateTime modified;
    private Boolean isDeleted;

    public ModelDto() {
    }

    public ModelDto(UUID id, String name, LocalDateTime endyear, LocalDateTime startyear, BrandDto brand, Enums.Category category, String imageurl, LocalDateTime created, LocalDateTime modified, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.endyear = endyear;
        this.startyear = startyear;
        this.brand = brand;
        this.category = category;
        this.imageurl = imageurl;
        this.created = created;
        this.modified = modified;
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

    public LocalDateTime getEndyear() {
        return this.endyear;
    }

    public void setEndyear(LocalDateTime endyear) {
        this.endyear = endyear;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getStartyear() {
        return this.startyear;
    }

    public void setStartyear(LocalDateTime startyear) {
        this.startyear = startyear;
    }

    public BrandDto getBrand() {
        return this.brand;
    }

    public void setBrand(BrandDto brand) {
        this.brand = brand;
    }

    public Enums.Category getCategory() {
        return this.category;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
