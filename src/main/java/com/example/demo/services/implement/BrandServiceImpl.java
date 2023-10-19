package com.example.demo.services.implement;

import com.example.demo.dtos.BrandDto;
import com.example.demo.model.Brand;
import com.example.demo.repositories.BrandRepository;
import com.example.demo.services.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class BrandServiceImpl implements BrandService<UUID> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BrandRepository brandRepository;


    @Override
    public BrandDto createNewBrand(BrandDto brandDto) {
        Brand brand = modelMapper.map(brandDto, Brand.class);
        return modelMapper.map(brandRepository.save(brand), BrandDto.class);
    }

    @Override
    public List<BrandDto> getAllBrands() {
        List<Brand> brands = brandRepository.findAll();
        return brands.stream()
                .map(brand -> modelMapper.map(brand, BrandDto.class))
                .collect(java.util.stream.Collectors.toList());

    }

    @Override
    public BrandDto getBrandById(UUID id) {
        return modelMapper.map(brandRepository.findById(id).get(), BrandDto.class);
    }

    @Override
    public BrandDto updateBrand(UUID id, BrandDto brandDto) {
        Brand brand = brandRepository.findById(id).get();
        modelMapper.map(brandDto, brand);
        return modelMapper.map(brandRepository.save(brand), BrandDto.class);
    }

    @Override
    public void deleteBrand(UUID id) {
        brandRepository.deleteById(id);
    }
}
