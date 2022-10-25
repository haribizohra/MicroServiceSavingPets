package com.example.local.entities.dtos;

import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ReservationDTO {
	
    public long idReservation;
    public Date dateDebut;
    public Date dateFin;
    public long idLocal;

}
