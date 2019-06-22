package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Fonctions implements Serializable {
	@Override
	public String toString() {
		return "Fonctions [idFonction=" + idFonction + ", nomFonction=" + nomFonction + ", role=" + role
				+ ", personnels=" + personnels + "]";
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFonction;
	public Long getIdFonction() {
		return idFonction;
	}
	public void setIdFonction(Long idFonction) {
		this.idFonction = idFonction;
	}
	private String nomFonction;
	private String role;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	private Personnels personnels ;
	public Fonctions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fonctions(String nomFonction, String role) {
		super();
		this.nomFonction = nomFonction;
		this.role = role;
	}
	public String getNomFonction() {
		return nomFonction;
	}
	public void setNomFonction(String nomFonction) {
		this.nomFonction = nomFonction;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Personnels getPersonnels() {
		return personnels;
	}
	public void setPersonnels(Personnels personnels) {
		this.personnels = personnels;
	}
	
}
