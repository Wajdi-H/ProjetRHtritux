package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Departements implements Serializable {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDept;
	@Id
	private int numDept;
	@Override
	public String toString() {
		return "Departements [idDept=" + idDept + ", numDept=" + numDept + ", nomDept=" + nomDept + ", personnels="
				+ personnels + ", sousDepartements=" + sousDepartements + "]";
	}
	private String nomDept;
	//@JsonIgnore
	@OneToMany(mappedBy = "departements", cascade = CascadeType.ALL)
	private Collection<Personnels> personnels;

	//@JsonIgnore
	@OneToMany(mappedBy = "departements", cascade = CascadeType.ALL)
	private Collection<SousDepartements> sousDepartements;
	
	
	public Departements() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Departements(int numDept, String nomDept) {
		super();
		this.numDept = numDept;
		this.nomDept = nomDept;
	}
	
	public Collection<Personnels> getPersonnel() {
		return personnels;
	}
	public void setPersonnel(Collection<Personnels> personnels) {
		this.personnels = personnels;
	}
	public Collection<SousDepartements> getSousDepartements() {
		return sousDepartements;
	}
	public void setSousDepartements(Collection<SousDepartements> sousDepartements) {
		this.sousDepartements = sousDepartements;
	}
	public Long getIdDept() {
		return idDept;
	}
	public void setIdDept(Long idDept) {
		this.idDept = idDept;
	}
	public int getNumDept() {
		return numDept;
	}
	public void setNumDept(int numDept) {
		this.numDept = numDept;
	}
	public String getNomDept() {
		return nomDept;
	}
	public void setNomDept(String nomDept) {
		this.nomDept = nomDept;
	}
	
	
}
