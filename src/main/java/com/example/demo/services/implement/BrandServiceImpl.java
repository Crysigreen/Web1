package com.example.demo.services.implement;

import com.example.demo.dtos.BrandDto;
import com.example.demo.dtos.addBrandDto;
import com.example.demo.model.Brand;
import com.example.demo.repositories.BrandRepository;
import com.example.demo.services.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
//@EnableCaching
public class BrandServiceImpl implements BrandService<UUID> {

    private final ModelMapper modelMapper;
    private final BrandRepository brandRepository;

    public BrandServiceImpl(ModelMapper modelMapper, BrandRepository brandRepository) {
        this.modelMapper = modelMapper;
        this.brandRepository = brandRepository;
    }


//    @Autowired
//    public void setBrandRepository(BrandRepository brandRepository) {
//        this.brandRepository = brandRepository;
//    }
//    @Autowired
//    public void setModelMapper(ModelMapper modelMapper) {
//        this.modelMapper = modelMapper;
//    }

    //@CacheEvict(cacheNames = "brands", allEntries = true)
    public void addNewBrand(addBrandDto brandDto) {
        brandRepository.saveAndFlush(modelMapper.map(brandDto, Brand.class));
    }

    @Override
    //@CacheEvict(cacheNames = "brands", allEntries = true)
    public BrandDto createNewBrand(BrandDto brandDto) {
        Brand brand = modelMapper.map(brandDto, Brand.class);
        return modelMapper.map(brandRepository.save(brand), BrandDto.class);
    }

    @Override
    //@Cacheable("brands")
    public List<BrandDto> getAllBrands() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<Brand> brands = brandRepository.findAll();
        return brands.stream()
                .map(brand -> modelMapper.map(brand, BrandDto.class))
                .collect(java.util.stream.Collectors.toList());

    }

    @Override
    public BrandDto getBrandById(UUID id) {
        return modelMapper.map(brandRepository.findById(id).get(), BrandDto.class);
    }

    public void removeCompany(String brandName) {
        brandRepository.deleteByName(brandName);
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

    @Override
    public BrandDto isDeleted(UUID id){
        Brand brand = brandRepository.findById(id).get();
        brand.setDeleted(true);
        brandRepository.save(brand);
        return modelMapper.map(brand,BrandDto.class);
    }
}
