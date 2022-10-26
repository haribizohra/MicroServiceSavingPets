package com.esprit.microservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.esprit.microservice.entity.Campagne;
import com.esprit.microservice.repository.CampagneRepository;
import com.esprit.microservice.service.IcamganeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/campagne")
public class EventRestApi {
	private String title="hello,i'm the event microservice";
	
	@Autowired
	IcamganeService campagneService;
	@Autowired
	CampagneRepository campagneRep;
	
	@GetMapping
	@ResponseBody
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	
	@GetMapping("/retriveAll")
    @ResponseBody
	public List<Campagne> getAllCampagnes(){
		List<Campagne> campagnes = campagneService.retriveAllCampagnes();
		return campagnes;
	}
	
	@GetMapping("/retrive/{id}")
    @ResponseBody
	public ResponseEntity<Campagne> getCampagne(@PathVariable("id") Long id) {
		Optional<Campagne> campagne =campagneRep.findById(id);
		return campagne.map(camp -> new ResponseEntity<>(camp,HttpStatus.OK))
				.orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
		
		/*
		Campagne campagne = campagneService.retriveCampagne(id);
		return campagne;
		*/
	}
	
	@PostMapping("add")
	@ResponseBody
	public Campagne addCampagne(@RequestBody Campagne campagne) {
		return campagneService.addCampagne(campagne);
	}
	
	@PutMapping("/update/{id}")
	@ResponseBody
	public Campagne updateCampagne(@RequestBody Campagne campagne,@PathVariable("id") int id) {
		return campagneService.updateCampagne(campagne);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public void deleteCampagne(@PathVariable("id") Long id) {
		campagneService.deleteCampagne(id);
	}
	
	
	
	
	
	
	
	
	
	
}
