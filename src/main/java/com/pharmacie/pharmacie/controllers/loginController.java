package com.pharmacie.pharmacie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pharmacie.pharmacie.entities.patient;
import com.pharmacie.pharmacie.services.patientService;

@Controller
public class loginController {

	@Autowired
	private final patientService pService;

	public loginController(patientService ps) {
		this.pService = ps;
	}

	// the welcome page
	@RequestMapping("/index")
	public String firstPage() {
		return "frontend/index";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "frontend/login";
	}

	@RequestMapping("/signup")
	public String signupPage(Model model) {
		patient p = new patient();
		p.setBanned(false);
		p.setNotificationOn(false);
		p.setPregnant(false);
		model.addAttribute("patient", p);
		return "frontend/signup";
	}

	@PostMapping("/signup")
	public String signupPost(@ModelAttribute("patient") patient p) {
		pService.addNewPatient(p);
		return "frontend/login";
	}
}
