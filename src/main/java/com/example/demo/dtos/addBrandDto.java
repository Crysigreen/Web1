package com.example.demo.dtos;

import com.example.demo.validation.UniqueBrandName;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class addBrandDto {

    @UniqueBrandName
    private String name;


    @NotEmpty(message = "Brand name must not be null or empty!")
    @Size(min = 2, max = 10, message = "Brand name must be between 2 and 10 characters!")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
