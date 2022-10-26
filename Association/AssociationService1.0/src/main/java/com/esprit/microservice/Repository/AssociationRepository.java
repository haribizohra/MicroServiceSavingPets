package com.esprit.microservice.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservice.Entity.Association;
public interface AssociationRepository extends JpaRepository<Association,Integer> {

}
