package com.example.demo.services;

import com.example.demo.dtos.BrandDto;
import org.springframework.stereotype.Service;

import java.util.List;



public interface BrandService<ID> {

    BrandDto createNewBrand(BrandDto brandDto);

    List<BrandDto> getAllBrands();

    BrandDto getBrandById(ID id);

    BrandDto updateBrand(ID id, BrandDto brandDto);

    BrandDto isDeleted (ID id);
    void deleteBrand(ID id);

}
