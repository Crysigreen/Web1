package com.example.demo.Web;

import com.example.demo.dtos.OfferDto;
import com.example.demo.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class OfferController {

    private OfferService offerService;

    @Autowired
    public void setOfferService(OfferService offerService){
        this.offerService = offerService;
    }

    @PostMapping("/offer")
    public OfferDto createOffer(@RequestBody OfferDto offerDto){
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
