package com.example.demo.repositories;

import com.example.demo.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface BrandRepository extends JpaRepository<Brand, UUID> {

    Optional<Brand> findByName(String name);

    @Modifying
    @Transactional
    void deleteByName(String name);

}
