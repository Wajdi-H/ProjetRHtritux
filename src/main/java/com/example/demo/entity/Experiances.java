package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Experiances implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idExp;
private double expExterne;
private double expInterne;
@Override
public String toString() {
	return "Experiances [idExp=" + idExp + ", expExterne=" + expExterne + ", expInterne=" + expInterne + ", nomExSos="
			+ nomExSos + ", personnel=" + personnel + "]";
}
private String nomExSos;
@OneToOne
private Personnels personnel;
public Experiances()  {
	super();
	// TODO Auto-generated constructor stub
}
public Experiances(double expExterne, double expInterne, String nomExSos) {
	super();
	this.expExterne = expExterne;
	this.expInterne = expInterne;
	this.nomExSos = nomExSos;
}
public Long getIdExp() {
	return idExp;
}
public void setIdExp(Long idExp) {
	this.idExp = idExp;
}
public double getExpExterne() {
	return expExterne;
}
public void setExpExterne(double expExterne) {
	this.expExterne = expExterne;
}
public double getExpInterne() {
	return expInterne;
}
public void setExpInterne(double expInterne) {
	this.expInterne = expInterne;
}
public String getNomExSos() {
	return nomExSos;
}
public void setNomExSos(String nomExSos) {
	this.nomExSos = nomExSos;
}
public Personnels getPersonnel() {
	return personnel;
}
public void setPersonnel(Personnels personnel) {
	this.personnel = personnel;
}


}
