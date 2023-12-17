package com.example.demo.services.implement;

import com.example.demo.dtos.BrandDto;
import com.example.demo.dtos.ModelDto;
import com.example.demo.model.Brand;
import com.example.demo.model.Model;
import com.example.demo.repositories.BrandRepository;
import com.example.demo.repositories.ModelRepository;
import com.example.demo.services.BrandService;
import com.example.demo.services.ModelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
public class ModelServiceImpl implements ModelService<UUID> {

    private ModelMapper modelMapper;
    private ModelRepository modelRepository;
    @Autowired
    public void setModelRepository(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }
    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ModelDto createNewModel(ModelDto modelDto) {
        Model model = modelMapper.map(modelDto, Model.class);
        return modelMapper.map(modelRepository.save(model), ModelDto.class);
    }

    @Override
    public List<ModelDto> getAllModels() {
        List<Model> models = modelRepository.findAll();
        return models.stream()
                .map(model -> modelMapper.map(model, ModelDto.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public List<ModelDto> getTopThreeModels(){
        List<Model> topThreeModelsList = modelRepository.findTopThree();
        return topThreeModelsList.stream().map(models -> modelMapper.map(models, ModelDto.class)).collect(Collectors.toList());
    }

    @Override
    public ModelDto getModelById(UUID id) {
        return modelMapper.map(modelRepository.findById(id).get(), ModelDto.class);
    }

    @Override
    public ModelDto updateModel(UUID id, ModelDto modelDto) {
        Model model = modelRepository.findById(id).get();
        modelMapper.map(modelDto, model);
        return modelMapper.map(modelRepository.save(model), ModelDto.class);
    }

    @Override
    public List<Model> findAllModelByUserName(String firstName){
        return modelRepository.findAllModelByUserName(firstName);
    }

    @Override
    public void deleteModel(UUID id) {
        modelRepository.deleteById(id);
    }
}
