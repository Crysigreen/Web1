package com.example.demo.Web;

import com.example.demo.dtos.AddOfferDto;
import com.example.demo.dtos.ModelDto;
import com.example.demo.dtos.OfferDto;
import com.example.demo.services.ModelService;
import com.example.demo.services.OfferService;
import com.example.demo.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.Principal;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/offers")
public class OfferController {

    private static final Logger LOG = LogManager.getLogger(Controller.class);
    private OfferService offerService;
    private ModelService modelService;
    private UserService userService;

    @Autowired
    public void setOfferService(OfferService offerService){this.offerService = offerService;}
    @Autowired
    public void setModelService(ModelService modelService){this.modelService = modelService;}
    @Autowired
    public void setUserService(UserService userService){this.userService = userService;}

    @GetMapping("/offers")
    public String getAllOffers(Principal principal, Model model) {
        LOG.log(Level.INFO, "show all offers for: " + principal.getName());
        List<AddOfferDto> offers = offerService.getAllOffers();
        model.addAttribute("offers", offers);
        return "offers";
    }

    @GetMapping("/add")
    public String showCreateOfferForm(Model model) {
        model.addAttribute("availableModels", modelService.getAllModels());
        model.addAttribute("availableUsers", userService.getAllUsers());
        model.addAttribute("AddOfferDto", new AddOfferDto());

        return "offer-add";
    }

    @PostMapping("/offer/create")
    public String createOffer(@Valid AddOfferDto offerModel, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("offerModel", offerModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.offerModel", bindingResult);
            return "redirect:/offers/add";
        }
        offerService.register(offerModel);

        return "redirect:/";
    }


    @PostMapping("/offer")
    public OfferDto createOfferD(@RequestBody OfferDto offerDto){
        OfferDto createOffer = offerService.createOffer(offerDto);
        return createOffer;
    }

    @GetMapping("/offer")
    public List<OfferDto> getAllOffers(){
        List<OfferDto> allOffers = offerService.getAllOffers();
        return allOffers;
    }

    @GetMapping("/offer/{id}")
    public OfferDto getOfferById(@PathVariable UUID id){
        OfferDto offerById = offerService.getOfferById(id);
        return offerById;
    }

    @PutMapping("/offer/{id}")
    public OfferDto updateOffer(@PathVariable UUID id, @RequestBody OfferDto offerDto){
        OfferDto updateOffer = offerService.updateOffer(id, offerDto);
        return updateOffer;
    }

    @DeleteMapping("/offer/{id}")
    public void deleteOffer(@PathVariable UUID id){
        offerService.deleteOffer(id);
    }

}
