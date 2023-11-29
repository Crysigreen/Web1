package com.example.demo.repositories;

import com.example.demo.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface ModelRepository extends JpaRepository<Model, UUID> {

    @Query("SELECT mdl FROM Model mdl WHERE mdl.id in(" +
            "select ofr.id from Offer ofr where ofr.seller.id in(" +
            "select usr.id from User usr where usr.firstname = :userName))")
    List<Model> findAllModelByUserName(@Param("userName") String userName);

}
