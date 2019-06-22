package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class SousDepartements implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSouDept;
	private String nomSousDept;
	private String tache;
	//@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
    private Departements departements ;
	public SousDepartements() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SousDepartements(String nomSousDept, String tache) {
		super();
		this.nomSousDept = nomSousDept;
		this.tache = tache;
	}
	public Long getIdSouDept() {
		return idSouDept;
	}
	

	public void setIdSouDept(Long idSouDept) {
		this.idSouDept = idSouDept;
	}
	public String getNomSousDept() {
		return nomSousDept;
	}
	public void setNomSousDept(String nomSousDept) {
		this.nomSousDept = nomSousDept;
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}


	public Departements getSsdepartements() {
		return departements;
	}


	public void setSsdepartements(Departements departements) {
		this.departements = departements;
	}


	public SousDepartements(String nomSousDept, String tache, Departements departements) {
		super();
		this.nomSousDept = nomSousDept;
		this.tache = tache;
		this.departements = departements;
	}

	
	
	
}
