package com.example.demo.services;

import com.example.demo.dtos.AddOfferDto;
import com.example.demo.dtos.OfferDto;
import com.example.demo.dtos.homeOffer;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

import java.util.List;
@EnableCaching
public interface OfferService<ID> {

    OfferDto createOffer(OfferDto offerDto);

    @CacheEvict(cacheNames = "offers", allEntries = true)
    void register(AddOfferDto offer);

    @Cacheable("offers")
    List<AddOfferDto> getAllOffers();

    List<homeOffer> getHomeOffer();

    OfferDto getOfferById(ID id);

    OfferDto updateOffer(ID id, OfferDto offerDto);

    void deleteOffer(ID id);
}
