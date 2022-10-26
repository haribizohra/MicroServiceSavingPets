package com.esprit.microservice.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.entity.Campagne;
import com.esprit.microservice.repository.CampagneRepository;

@Service
public class campagneService implements IcamganeService {
	
	@Autowired
	CampagneRepository campagneRep;

	@Override
	public List<Campagne> retriveAllCampagnes() {
		List<Campagne> campagnes =(List<Campagne>) campagneRep.findAll();
		return campagnes;
	}
	
	@Override
	public Campagne addCampagne(Campagne campagne) {
		return campagneRep.save(campagne);
	}

	@Override
	public void deleteCampagne(Long id) {
		campagneRep.deleteById(id);
	}

	@Override
	public Campagne updateCampagne(Campagne camp) {
		return campagneRep.save(camp);
	}

	@Override
	public Campagne retriveCampagne(Long id) {
		Campagne campagne =campagneRep.getById(id);
		return campagne;
	}

}
