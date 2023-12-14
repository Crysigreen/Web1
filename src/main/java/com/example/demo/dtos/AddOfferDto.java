package com.example.demo.dtos;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import com.example.demo.model.Enums;


public class AddOfferDto {

    private String id;
    private String model;
    private String user;
    private String description;
    private Enums.Engine engineEnum;
    private String imageURL;
    private int mileage;
    private Double price;
    private Enums.Transmission transmissionEnum;
    private int year;
//    private LocalDate created;
//    private String seller;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @NotEmpty(message = "Name of model cannot be null or empty!")
    @Size(min = 2, message = "Name of model should be at least 2 characters long!")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @NotEmpty(message = "Description must not be null or empty!")
    @Size(min = 10, message = "Description must be at least 10 characters!")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull(message = "Please choose an engine type!")
    public Enums.Engine getEngineEnum() {
        return engineEnum;
    }

    public void setEngineEnum(Enums.Engine engineEnum) {
        this.engineEnum = engineEnum;
    }

    @NotEmpty(message = "Last name cannot be null or empty!")
    @Size(min = 10, message = "Image URL must be minimum two characters!")
    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageUrl) {
        this.imageURL = imageUrl;
    }

    @NotNull(message = "Mileage cannot be null or empty!")
    @Min(value = 1, message = "Mileage must be a positive number!")
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @NotNull(message = "Price cannot be null or empty!")
    @Min(value = 1, message = "Price must be a positive number!")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @NotNull(message = "Please choose a transmission!")
    public Enums.Transmission getTransmissionEnum() {
        return transmissionEnum;
    }

    public void setTransmissionEnum(Enums.Transmission transmissionEnum) {
        this.transmissionEnum = transmissionEnum;
    }

    @NotNull(message = "Year cannot be null or empty!")
    @Min(value = 1, message = "Year must be a positive number!")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    @NotNull(message = "Date of model create cannot be null or empty!")
//    public LocalDate getCreated() {
//        return created;
//    }
//
//    public void setCreated(LocalDate created) {
//        this.created = created;
//    }

    @NotEmpty(message = "Seller name must not be null or empty!")
    @Size(min = 3, message = "Seller name must be at least 3 characters!")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}