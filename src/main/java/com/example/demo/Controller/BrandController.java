package com.example.demo.Controller;

import com.example.demo.dtos.BrandDto;
import com.example.demo.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BrandController {
    @Autowired
    private BrandService brandService;


    @PostMapping("/brand")
    BrandDto createNewBrand(@RequestBody BrandDto brandDto){
        BrandDto createBrand = brandService.createNewBrand(brandDto);
        return createBrand;
    }

    @GetMapping("/brand")
    List<BrandDto> getAllBrands(){
        List<BrandDto> brands = brandService.getAllBrands();
        return brands;
    }

    @GetMapping("/brand/{id}")
    BrandDto getBrandById(@PathVariable UUID id){
        BrandDto brand = brandService.getBrandById(id);
        return brand;
    }

    @PutMapping("/brand/{id}")
    BrandDto updateBrand(@PathVariable UUID id, @RequestBody BrandDto brandDto){
        BrandDto updateBrand = brandService.updateBrand(id, brandDto);
        return updateBrand;
    }

    @DeleteMapping("/brand/{id}")
    Void deleteBrand(@PathVariable UUID id){
        brandService.deleteBrand(id);
        return null;
    }


}
