package com.example.local.entities.dtos;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class LocalDTO {
	
    public long idLocal;
    public String nomLocal;
    public String numTel;
    public String adresse;
}
