package com.example.demo.repositories;

import com.example.demo.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface BrandRepository extends JpaRepository<Brand, UUID> {

}
