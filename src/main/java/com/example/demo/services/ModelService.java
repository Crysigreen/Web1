package com.example.demo.services;

import com.example.demo.dtos.ModelDto;
import org.springframework.stereotype.Service;

import java.util.List;



public interface ModelService<ID>{

    ModelDto createNewModel(ModelDto modelDto);

    List<ModelDto> getAllModels();

    ModelDto getModelById(ID id);

    ModelDto updateModel(ID id, ModelDto modelDto);

    void deleteModel(ID id);


}
