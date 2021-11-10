package com.pharmacie.pharmacie.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pharmacie.pharmacie.domain.entities.announcement;
import com.pharmacie.pharmacie.domain.services.announcementService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;    

@Controller
public class AnnouncementMVCcontroller {

	@Autowired
    protected final announcementService aService;

    public AnnouncementMVCcontroller(announcementService aService) {
        this.aService = aService;
    }
    
    @GetMapping("/announcement/list")    
    public String Announcementlist(Model m){    
        List<announcement> list= aService.getAnnouncementAll();
        m.addAttribute("list",list);  
        return "backend/Announcement/list";    
    }   
    
    @GetMapping("/announcement/add")
    public String showSignUpForm(announcement ann) {
        return "backend/Announcement/add";
    }
    
    @PostMapping("/announcement/add")
    public String addUser(announcement ann, Model model) {
     
        
        aService.addAnnouncement(ann);
        return "redirect:/announcement/list";
    }
    
    
    
    @GetMapping("/announcement/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) throws IllegalAccessException{
        announcement ann = aService.getAnnouncement(id);
         if (ann == null){
        		throw new IllegalArgumentException("Invalid user Id:" + id);
         }
         aService.deleteAnnouncement(id);
        return "redirect:/announcement/list";
    }
    
    @GetMapping("/announcement/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model)  throws IllegalAccessException {
    	 announcement ann = aService.getAnnouncement(id);
         if (ann == null){
        		throw new IllegalArgumentException("Invalid user Id:" + id);
         }
        model.addAttribute("ann", ann);
        return "backend/Announcement/edit";
    }
    
    @PostMapping("/announcement/update/{id}")
    public String updateUser(@PathVariable("id") long id, announcement ann, 
       Model model) {

            
        //userRepository.save(user);
        aService.editAnnouncement(ann);
        return "redirect:/announcement/list";
    }
}
