package com.pharmacie.pharmacie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmacie.pharmacie.entities.patient;

@Repository
public interface PatientRepository extends JpaRepository<patient, Long> {

}
