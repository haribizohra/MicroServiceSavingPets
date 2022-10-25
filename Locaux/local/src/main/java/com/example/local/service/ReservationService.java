package com.example.local.service;

import java.util.List;

import com.example.local.entities.dtos.ReservationDTO;

public interface ReservationService {
	public List<ReservationDTO>getList();
	public List<ReservationDTO>getReservationByIdLocal(long id);
	public ReservationDTO getReservationById(long idReservation); 
	public ReservationDTO updateReservation(long idReservation ,ReservationDTO RequestReservation); 
	public void deleteReservation(long idPost); 

}
