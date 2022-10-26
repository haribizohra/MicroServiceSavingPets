package com.esprit.microservice.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.esprit.microservice.Service.AssociationService;
import com.esprit.microservice.Entity.Association;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class AssociationRestApi {
	private String title="Hello , i'm the Association Microservice";
	
	@Autowired
	private AssociationService associationService;
	
	@RequestMapping("/hello")
	public String sayHello(){
	System.out.println(title);
	return title;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Association> createAssociation(@RequestBody Association association){
		return new ResponseEntity<>(associationService.addAssociation(association), HttpStatus.OK);
	}
	@PutMapping(value = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Association>updateAssociation(@PathVariable(value = "id") int id,
														@RequestBody Association association){
	return new ResponseEntity<>(associationService.updateAssociation(id, association),HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteAssociation(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(associationService.deleteAssociation(id), HttpStatus.OK);
	}
	
	
	

}
