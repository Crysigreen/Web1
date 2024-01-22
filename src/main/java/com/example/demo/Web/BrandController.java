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

    @ModelAttribute("brandModel")
    public addBrandDto initBrand() {
        return new addBrandDto();
    }

    @GetMapping("/add")
    public String addBrand() {
        return "brand-add";
    }

    @PostMapping("/add")
    public String createNewBrand(@Valid addBrandDto brandDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
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

}
