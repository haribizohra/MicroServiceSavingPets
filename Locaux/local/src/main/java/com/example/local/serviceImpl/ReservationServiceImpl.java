package com.example.local.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.local.entities.dtos.ReservationDTO;
import com.example.local.repositories.ReservationRepository;
import com.example.local.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    ReservationRepository ReservationRepository;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private  SequenceGeneratorService sequenceGeneratorService;
	@Override
	public List<ReservationDTO> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ReservationDTO> getReservationByIdLocal(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ReservationDTO getReservationById(long idReservation) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ReservationDTO updateReservation(long idReservation, ReservationDTO RequestReservation) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteReservation(long idPost) {
		// TODO Auto-generated method stub
		
	}
}
