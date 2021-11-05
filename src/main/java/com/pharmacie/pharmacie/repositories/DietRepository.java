package com.pharmacie.pharmacie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmacie.pharmacie.entities.diet;

public interface DietRepository extends JpaRepository<diet, Long> {

}
