package com.example.demo.services.implement;

import com.example.demo.dtos.OfferDto;
import com.example.demo.model.Offer;
import com.example.demo.repositories.OfferRepository;
import com.example.demo.services.OfferService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OfferServiceImpl implements OfferService<UUID> {

    private OfferRepository offerRepository;
    private ModelMapper modelMapper;
    @Autowired
    public void setOfferRepository(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }
    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public OfferDto createOffer(OfferDto offerDto){
        Offer offer = modelMapper.map(offerDto, Offer.class);
        return modelMapper.map(offerRepository.save(offer), OfferDto.class);
    }

    @Override
    public List<OfferDto> getAllOffers(){
        List<Offer> offers = offerRepository.findAll();
        return offers.stream()
                .map(offer -> modelMapper.map(offer, OfferDto.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public OfferDto getOfferById(UUID id){
        return modelMapper.map(offerRepository.findById(id).get(), OfferDto.class);
    }

    @Override
    public OfferDto updateOffer(UUID id, OfferDto offerDto){
        Offer offer = offerRepository.findById(id).get();
        modelMapper.map(offerDto, offer);
        return modelMapper.map(offerRepository.save(offer), OfferDto.class);
    }

    @Override
    public void deleteOffer(UUID id){
        offerRepository.deleteById(id);
    }
}
