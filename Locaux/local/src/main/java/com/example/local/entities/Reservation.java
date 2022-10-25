package com.example.local.entities;
import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Reservation")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservation {
	   @Transient
	    public static final String SEQUENCE_NAME = "database_sequences";
	    @Id
	    @Field(value = "idReservation")
	    private long idReservation;
	    
	    @Field(value = "dateDebut")
	    private Date dateDebut;
	    
	    @Field(value = "dateFin")
	    private Date dateFin;
	    
	    @Field(value = "idLocal")
	    private long idLocal;
	    

}
