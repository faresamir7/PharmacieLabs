package com.pharmacie.pharmacie.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacie.pharmacie.domain.entities.announcement;
import com.pharmacie.pharmacie.domain.repositories.announcementRepository;

@Service
public class announcementService {
	  @Autowired
	    private final announcementRepository dRepo;

	    public announcementService(announcementRepository dRepo) {
	        this.dRepo = dRepo;
	    }
	    
	    public announcement getAnnouncement(int id) {
	        Long longid = Long.valueOf(id);
	        return dRepo.getById(longid);
	    }

	    public List<announcement> getAnnouncementAll() {
	        return dRepo.findAll();
	    }

	    public void addAnnouncement(announcement d) {
	        for (announcement e : dRepo.findAll()) {
	            if(e.equals(d)) {
	                return;
	            }
	        }
	        dRepo.save(d);
	    }

	    public void deleteAnnouncement(int id) {
	        Long longid = Long.valueOf(id);
	        dRepo.deleteById(longid);
	    }

}
