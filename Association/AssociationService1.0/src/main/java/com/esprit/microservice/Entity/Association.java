package com.esprit.microservice.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Association implements Serializable{
	private static final long serialVersionUID = 6;

	@Id
	@GeneratedValue
	private int IdAssociation;
	private String Nom, Email;
	
	public int getIdAssociation() {
		return IdAssociation;
	}
	public void setIdAssociation(int idAssociation) {
		IdAssociation = idAssociation;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public Association() {
		super();
	}
	
	public Association(String Nom) {
		super();
		this.Nom=Nom;
	}
	
	
	
}
