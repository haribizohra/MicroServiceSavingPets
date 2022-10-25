package com.example.local.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.local.entities.Reservation;
import com.example.local.entities.Local;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation,Long> {
	public List<Local> findByIdLocal(long idLocal);
	public List<Reservation> findByIdReservation(long idReservation);

	

}
