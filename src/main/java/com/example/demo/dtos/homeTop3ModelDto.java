package com.example.demo.dtos;

import com.example.demo.model.Model;

public class homeTop3ModelDto {
    private Model model;
    private Long count;

    public homeTop3ModelDto() {
    }

    public homeTop3ModelDto(Model model, Long count) {
        this.model = model;
        this.count = count;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
