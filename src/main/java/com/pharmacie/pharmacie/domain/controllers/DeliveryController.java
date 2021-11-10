package com.pharmacie.pharmacie.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.pharmacie.pharmacie.domain.entities.Delivery;
import com.pharmacie.pharmacie.domain.services.DeliveryService;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeliveryController {
	@Autowired
	private final DeliveryService delivService;
	
	public DeliveryController(DeliveryService delivService) {
		this.delivService = delivService;
	}

	
	//show delivery by id
	@GetMapping("/api/v1/delivery/showDeliv/{idDeliv}")
	public ResponseEntity<Delivery> getDeliverydetails(@PathVariable Long idDeliv) {
		return ResponseEntity.ok(delivService.getDelivInfo(idDeliv));
	}
	 
	// get Client Delivery
	@GetMapping("/api/v1/delivery/clientDelivery/{idClient}")
	public ResponseEntity<List <Delivery>> getClientDelivery(@PathVariable Long idClient) {
		return ResponseEntity.ok(delivService.getClientDelivery(idClient));
	}
	 
	// get All Delivery
		@GetMapping("/api/v1/delivery/all")
		public ResponseEntity<List <Delivery>> getAllDelivery() {
			return ResponseEntity.ok(delivService.getAllDelivery());
		}
	
		// create delivery
	@PostMapping("/api/v1/delivery/add")
	public ResponseEntity<Delivery>  createDelivery(@RequestBody Delivery deliv) {

		
		return ResponseEntity.ok(delivService.createDeliv(deliv));

	}
	
	//test
	@GetMapping("/api/v1/delivery/test")
	public String test() { 
		return "hello!";
	}
	
	// update delivery
	@PutMapping("/api/v1/delivery/update")
	public ResponseEntity<Delivery> updateDelivery( @RequestBody Delivery deliv) throws Exception {
		return ResponseEntity.ok(delivService.updateDeliv( deliv));
	}
	
	// cancel delivery
	@DeleteMapping("/api/v1/delivery/delete/{idDeliv}")
	public ResponseEntity<String> cancelDelivery(@PathVariable Long idDeliv ) {
		delivService.deleteDeliv(idDeliv);
		return ResponseEntity.ok("the delivery have been canceled");
	}
	
//	//ihm page delivery
//	@RequestMapping("/delivery/user")
//	public String userdeliveryPage() {
//		return "delivery/userDeliv";
//	}
	
	//send data from UI to controller
	 @GetMapping("/addDeliveryForm")
		public ModelAndView addDeliveryForm() {
			ModelAndView deliv = new ModelAndView("/delivery/userDeliv");
			Delivery newDelivery = new Delivery();
			deliv.addObject("delivery", newDelivery);
			return deliv;
		}
		
		
	 @PostMapping("/saveDelivery")
		public String saveDelivery(@ModelAttribute Delivery deliv ) {
			delivService.createDeliv(deliv);
			return "redirect:/delivery/admin";
		}
	
	//show delivery details in administrator page
	 @RequestMapping("/delivery/admin")
		public String backend(Model model) {
	    	model.addAttribute("deliveries", delivService.getAllDelivery() );
			return "/delivery/adminDelivMng";
		}
	 
	 //testttttttttttttttttttttt
	 //pleaaase work pls pls plssssssssssss
	 //contry road take me home to the place i belong 
	 
	 
	

	
	
	
	
	
}
