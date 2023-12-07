package com.example.demo.repositories;

import com.example.demo.dtos.homeOffer;
import com.example.demo.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OfferRepository  extends JpaRepository<Offer, UUID> {




    @Query("SELECT new com.example.demo.dtos.homeOffer(o.id, o.imageurl, o.price, o.model.name) FROM Offer o")
    List<homeOffer> findHomeOffers();
}
