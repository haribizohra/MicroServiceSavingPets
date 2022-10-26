package com.esprit.microservice.service;

import java.util.List;

import com.esprit.microservice.entity.Campagne;

public interface IcamganeService {
	public List<Campagne> retriveAllCampagnes();
	public Campagne addCampagne(Campagne campagne);
	public void deleteCampagne(Long id);
	public Campagne updateCampagne(Campagne camp);
	public Campagne retriveCampagne(Long id);

}
