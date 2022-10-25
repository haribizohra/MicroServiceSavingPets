package com.example.local.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Local")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Local {
	   @Transient
	    public static final String SEQUENCE_NAME = "database_sequences";
	    @Id
	    @Field(value = "idLocal")
	    private long idLocal;
	    
	    @Field(value = "nomLocal")
	    private String nomLocal;
	    
	    @Field(value = "numTel")
	    private String numTel;
	    
	    @Field(value = "adresse")
	    private String adresse;



}
