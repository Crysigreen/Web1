package com.example.demo.dtos;

import java.math.BigDecimal;
import java.util.UUID;

public class homeOffer {

    private UUID id;
    private String img;

    private BigDecimal price;
    private String modelName;

    public homeOffer(UUID id, String img, BigDecimal price, String modelName) {
        this.id = id;
        this.img = img;
        this.price = price;
        this.modelName = modelName;
    }

    public UUID getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getModelName() {
        return modelName;
    }
}
