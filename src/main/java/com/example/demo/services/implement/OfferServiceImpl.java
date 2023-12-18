package com.example.demo.services.implement;

import com.example.demo.dtos.AddOfferDto;
import com.example.demo.dtos.OfferDto;
import com.example.demo.dtos.homeOffer;
import com.example.demo.model.Offer;
import com.example.demo.repositories.ModelRepository;
import com.example.demo.repositories.OfferRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.OfferService;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@EnableCaching
public class OfferServiceImpl implements OfferService<UUID> {

    private OfferRepository offerRepository;
    private ModelMapper modelMapper;
    private ModelRepository modelRepository;
    private UserRepository userRepository;
    @Autowired
    public void setOfferRepository(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }
    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        modelMapper.addMappings(new PropertyMap<Offer, AddOfferDto>() {
            @Override
            protected void configure() {
                map().setModel(source.getModel().getName());
            }
        });
    }
    @Autowired
    public void setModelRepository(ModelRepository modelRepository){this.modelRepository = modelRepository;}
    @Autowired
    public void setUserRepository(UserRepository userRepository){this.userRepository = userRepository;}


    @Override
    public OfferDto createOffer(OfferDto offerDto){
        Offer offer = modelMapper.map(offerDto, Offer.class);
        return modelMapper.map(offerRepository.save(offer), OfferDto.class);
    }

    @CacheEvict(cacheNames = "offers", allEntries = true)
    public void register(AddOfferDto offer) {
        Offer of = modelMapper.map(offer, Offer.class);
        of.setCreated(LocalDateTime.now());
        of.setModel(modelRepository.findByName(offer.getModel()).orElse(null));
        of.setSeller(userRepository.findByUsername(offer.getUser()).orElse(null));
        offerRepository.saveAndFlush(of);
    }

    @Override
    public List<AddOfferDto> getAllOffers(){

        List<Offer> offers = offerRepository.findAll();
        return offers.stream()
                .map(offer -> modelMapper.map(offer, AddOfferDto.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public List<homeOffer> getHomeOffer(){
        List<homeOffer> offerList = offerRepository.findHomeOffers();
        return offerList.stream().collect(Collectors.toList());
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
