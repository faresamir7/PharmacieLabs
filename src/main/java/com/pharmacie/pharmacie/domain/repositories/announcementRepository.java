package com.pharmacie.pharmacie.domain.repositories;

import com.pharmacie.pharmacie.domain.entities.announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface announcementRepository extends JpaRepository<announcement,Long> {

}
