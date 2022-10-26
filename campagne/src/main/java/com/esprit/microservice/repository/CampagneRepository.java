package com.esprit.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservice.entity.Campagne;

public interface CampagneRepository extends JpaRepository<Campagne, Long> {

}
