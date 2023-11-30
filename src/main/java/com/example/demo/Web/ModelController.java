package com.example.demo.Web;

import com.example.demo.dtos.ModelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.ModelService;

import java.util.List;
import java.util.UUID;

@RestController
public class ModelController {

    private ModelService modelService;

    @Autowired
    public void setModelService(ModelService modelService){
        this.modelService = modelService;
    }


    @PostMapping("/model")
    ModelDto createNewModel(@RequestBody ModelDto modelDto){
        ModelDto createModel = modelService.createNewModel(modelDto);
        return createModel;
    }

    @GetMapping("/model")
    List<ModelDto> getAllModels(){
        List<ModelDto> models = modelService.getAllModels();
        return models;
    }

    @GetMapping("/model/1")
    List<ModelDto> findAllModelByUserName(@RequestBody String firstname){
        return modelService.findAllModelByUserName(firstname);
    }

    @GetMapping("/model/{id}")
    ModelDto getModelById(@PathVariable UUID id){
        ModelDto model = modelService.getModelById(id);
        return model;
    }

    @PutMapping("/model/{id}")
    ModelDto updateModel(@PathVariable UUID id, @RequestBody ModelDto modelDto){
        ModelDto updateModel = modelService.updateModel(id, modelDto);
        return updateModel;
    }

    @DeleteMapping("/model/{id}")
    Void deleteModel(@PathVariable UUID id){
        modelService.deleteModel(id);
        return null;
    }

}
