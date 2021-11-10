package com.pharmacie.pharmacie.domain.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacie.pharmacie.domain.entities.announcement;
import com.pharmacie.pharmacie.domain.services.announcementService;

@RestController
public class announcementController {

	@Autowired
    protected final announcementService aService;

    public announcementController(announcementService aService) {
        this.aService = aService;
    }

    @GetMapping("/api/v1/Announcement/showAll")
    public List<announcement> showAll() {
        return aService.getAnnouncementAll();
    }

    @PostMapping("/api/v1/Announcement/add")
    public void registerAannouncement(@RequestBody announcement a) {
    	aService.addAnnouncement(a);
    }

    @DeleteMapping("/api/v1/Announcement/delete")
    public void deleteAannouncement(@RequestBody int id) {
    	aService.deleteAnnouncement(id);
    }
    
}
