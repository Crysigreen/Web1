package com.example.demo.services;

import com.example.demo.dtos.ModelDto;
import com.example.demo.dtos.ShowModelInfoDto;
import com.example.demo.dtos.homeTop3ModelDto;
import com.example.demo.model.Model;

import java.util.List;



public interface ModelService<ID>{

    ModelDto createNewModel(ModelDto modelDto);

    List<ShowModelInfoDto> getAllModels();

    List<homeTop3ModelDto> getTopThreeModel();

    ModelDto getModelById(ID id);

    ModelDto updateModel(ID id, ModelDto modelDto);

    List<Model> findAllModelByUserName(String firstName);

    void deleteModel(ID id);


}
