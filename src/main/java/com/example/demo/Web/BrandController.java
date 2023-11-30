package com.example.demo.Web;

import com.example.demo.dtos.BrandDto;
import com.example.demo.dtos.addBrandDto;
import com.example.demo.services.BrandService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/brands")
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

//    @Autowired
//    public void setBrandService(BrandService brandService){
//        this.brandService = brandService;
//    }

    @ModelAttribute("brandModel")
    public addBrandDto initBrand() {
        return new addBrandDto();
    }

//    @PostMapping("/brand")
//    BrandDto createNewBrand(@RequestBody BrandDto brandDto){
//        BrandDto createBrand = brandService.createNewBrand(brandDto);
//        return createBrand;
//    }

    @GetMapping("/add")
    public String addBrand() {
        return "brand-add";
    }

    @PostMapping("/add")
    public String createNewBrand(@Valid addBrandDto brandDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        // Ваш код для обработки формы
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("brandDto", brandDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.brandDto",
                    bindingResult);
            return "redirect:/brands/add";
        }
        brandService.addNewBrand(brandDto);
        return "redirect:/";
    }

    @GetMapping("/all")
    public String showAllBrands(Model model) {
        model.addAttribute("brandInfos", brandService.getAllBrands());

        return "brand-all";
    }

//    @GetMapping("/brand-delete/{brand-name}")
//    public String deleteCompany(@PathVariable("brand-name") String brandName) {
//        brandService.removeCompany(brandName);
//        return "redirect:/brands/all";
//    }

    @GetMapping("/delete")
    public String showDeleteForm(Model model) {
        model.addAttribute("brandToDelete", new addBrandDto());
        return "brand-delete"; // Создайте файл brand-delete.html в папке templates
    }

    @PostMapping("/delete")
    public String deleteBrand(@ModelAttribute("brandToDelete") addBrandDto brandDto) {
        brandService.removeCompany(brandDto.getName());
        return "redirect:/brands/all";
    }


//    @GetMapping("/all")
//    List<BrandDto> getAllBrands(){
//        List<BrandDto> brands = brandService.getAllBrands();
//        return brands;
//    }

//    @GetMapping("/brand/{id}")
//    BrandDto getBrandById(@PathVariable UUID id){
//        BrandDto brand = brandService.getBrandById(id);
//        return brand;
//    }
//
//    @PutMapping("/brand/{id}")
//    BrandDto updateBrand(@PathVariable UUID id, @RequestBody BrandDto brandDto){
//        BrandDto updateBrand = brandService.updateBrand(id, brandDto);
//        return updateBrand;
//    }
//
//    @DeleteMapping("/brand/{id}")
//    Void deleteBrand(@PathVariable UUID id){
//        brandService.deleteBrand(id);
//        return null;
//    }
//
//    @GetMapping("/brand/delete/{id}")
//    BrandDto isDeleted(@PathVariable UUID id){
//        BrandDto deletedBrand = brandService.isDeleted(id);
//        return deletedBrand;
//    }


}
