package com.example.demo.services;

import com.example.demo.dtos.ModelDto;
import com.example.demo.model.Model;
import org.springframework.stereotype.Service;

import java.util.List;



public interface ModelService<ID>{

    ModelDto createNewModel(ModelDto modelDto);

    List<ModelDto> getAllModels();

    List<ModelDto> getTopThreeModels();

    ModelDto getModelById(ID id);

    ModelDto updateModel(ID id, ModelDto modelDto);

    List<Model> findAllModelByUserName(String firstName);

    void deleteModel(ID id);


}
