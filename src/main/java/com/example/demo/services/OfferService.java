package com.example.demo.services;

import com.example.demo.dtos.AddOfferDto;
import com.example.demo.dtos.OfferDto;
import com.example.demo.dtos.homeOffer;

import java.util.List;

public interface OfferService<ID> {

    OfferDto createOffer(OfferDto offerDto);

    void register(AddOfferDto offer);

    List<AddOfferDto> getAllOffers();

    List<homeOffer> getHomeOffer();

    OfferDto getOfferById(ID id);

    OfferDto updateOffer(ID id, OfferDto offerDto);

    void deleteOffer(ID id);
}
