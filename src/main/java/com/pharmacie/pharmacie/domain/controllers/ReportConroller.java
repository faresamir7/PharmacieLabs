package com.pharmacie.pharmacie.domain.controllers;

import java.io.Console;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import com.pharmacie.pharmacie.domain.entities.announcement;
import com.pharmacie.pharmacie.domain.services.announcementService;

@Controller
public class ReportConroller {
	
	@Autowired
    private final announcementService aService2;
	

	List<announcement> l;
	


	public ReportConroller(announcementService aService2) {
		
		this.aService2 = aService2;
		 l = aService2.getAnnouncementAll();
	}

	
	 Map<String, Integer> graphData = new TreeMap<>();
	
	 

	
	@RequestMapping(value = "/report", method = RequestMethod.GET)
    public String getPieChart(Model model) {
		System.out.println(l);
		for (announcement a : l){
			LocalDate lo = a.getAnnouncementDate().toLocalDate();
			
			int count = graphData.containsKey(String.valueOf(lo.getYear())) ?
					graphData.get(String.valueOf(lo.getYear())) : 0;
			graphData.put(String.valueOf(lo.getYear()), count + 1);
		}
		
//        Map<String, Integer> graphData = new TreeMap<>();
//        graphData.put("2016", 147);
//        graphData.put("2017", 1256);
//        graphData.put("2018", 3856);
//        graphData.put("2019", 19807);
        model.addAttribute("chartData", graphData);
        return "google-charts";
    }
}
