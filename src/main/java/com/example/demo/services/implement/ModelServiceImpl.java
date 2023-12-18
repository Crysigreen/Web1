package com.example.demo.services.implement;

import com.example.demo.dtos.ModelDto;
import com.example.demo.dtos.ShowModelInfoDto;
import com.example.demo.dtos.homeTop3ModelDto;
import com.example.demo.model.Model;
import com.example.demo.repositories.ModelRepository;
import com.example.demo.services.ModelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
@EnableCaching
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
    @CacheEvict(cacheNames = "models", allEntries = true)
    public ModelDto createNewModel(ModelDto modelDto) {
        Model model = modelMapper.map(modelDto, Model.class);
        return modelMapper.map(modelRepository.save(model), ModelDto.class);
    }
//    @Cacheable("models")
    public List<homeTop3ModelDto> getTopThreeModel(){
        return modelRepository.findTopThree();
    }

//    @Override
//    @Cacheable("models")
//    public List<ShowModelInfoDto> getAllModels() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        List<Model> models = modelRepository.findAll();
//        return models.stream()
//                .map(model -> modelMapper.map(model, ShowModelInfoDto.class))
//                .collect(Collectors.toList());
//    }

    @Cacheable("models")
    public List<ShowModelInfoDto> getAllModels() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return modelRepository.findAll().stream().map(model -> modelMapper.map(model, ShowModelInfoDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ModelDto getModelById(UUID id) {
        return modelMapper.map(modelRepository.findById(id).get(), ModelDto.class);
    }

    @Override
    @CacheEvict(cacheNames = "models", allEntries = true)
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
    @CacheEvict(cacheNames = "models", allEntries = true)
    public void deleteModel(UUID id) {
        modelRepository.deleteById(id);
    }
}