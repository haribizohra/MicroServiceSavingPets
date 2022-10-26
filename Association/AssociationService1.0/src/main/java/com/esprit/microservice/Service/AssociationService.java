package com.esprit.microservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.Entity.Association;
import com.esprit.microservice.Repository.AssociationRepository;

@Service
public class AssociationService {
	
	@Autowired
	private AssociationRepository associationRepository;
	
	public Association addAssociation(Association association) {
		return associationRepository.save(association);
	}
	public Association updateAssociation(int id, Association newAssociation) {
		if(associationRepository.findById(id).isPresent()) {
			Association existingAssociation = associationRepository.findById(id).get();
			existingAssociation.setNom(newAssociation.getNom());
			existingAssociation.setEmail(newAssociation.getEmail());
		
			return associationRepository.save(existingAssociation);
		}else
			return null;
	}
	public String deleteAssociation(int id) {
		if (associationRepository.findById(id).isPresent()) {
			associationRepository.deleteById(id);
			return " Association Supprimé ";
		}else 
			return "Association non supprimé";
	}
	

}
