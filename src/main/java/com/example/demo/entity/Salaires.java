package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Salaires implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idSalair;
private Date dateDebut;
private Date dateFin;
private double salaireBrut;
private double salaireNet;
@JsonIgnore
@OneToMany(mappedBy = "salaire", cascade = CascadeType.ALL, orphanRemoval = true)
private Collection<HeureSupplementaire> heureSupplementaire;

@JsonIgnore
@OneToMany(mappedBy="salaire", cascade = CascadeType.ALL, orphanRemoval = true)
private Collection<Prime>primes ;



public Salaires() {
	super();
	// TODO Auto-generated constructor stub
}
public Salaires(Date dateDebut, Date dateFin, double salaireBrut, double salaireNet) {
	super();
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.salaireBrut = salaireBrut;
	this.salaireNet = salaireNet;
}
public Long getIdSalair() {
	return idSalair;
}
public void setIdSalair(Long idSalair) {
	this.idSalair = idSalair;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Date getDateFin() {
	return dateFin;
}
public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}
public double getSalaireBrut() {
	return salaireBrut;
}
public void setSalaireBrut(double salaireBrut) {
	this.salaireBrut = salaireBrut;
}
public double getSalaireNet() {
	return salaireNet;
}
public void setSalaireNet(double salaireNet) {
	this.salaireNet = salaireNet;
}
public Collection<HeureSupplementaire> getHeureSupplementaire() {
	return heureSupplementaire;
}
public void setHeureSupplementaire(Collection<HeureSupplementaire> heureSupplementaire) {
	this.heureSupplementaire = heureSupplementaire;
}
public Collection<Prime> getPrimes() {
	return primes;
}
public void setPrimes(Collection<Prime> primes) {
	this.primes = primes;
}

}
