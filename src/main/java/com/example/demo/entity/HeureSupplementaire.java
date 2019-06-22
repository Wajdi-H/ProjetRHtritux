package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class HeureSupplementaire implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idHeure;
private double nbHeure;
private Date dateDebutSupp;
@Override
public String toString() {
	return "HeureSupplementaire [idHeure=" + idHeure + ", nbHeure=" + nbHeure + ", dateDebutSupp=" + dateDebutSupp
			+ ", dateFinSupp=" + dateFinSupp + ", calculNbSupp=" + calculNbSupp + ", salaire=" + salaire + "]";
}
private Date dateFinSupp;
private double calculNbSupp;
@JsonIgnore
@ManyToOne(fetch=FetchType.LAZY)
private Salaires salaire  ;
public HeureSupplementaire() {
	super();
	// TODO Auto-generated constructor stub
}
public HeureSupplementaire(double nbHeure, Date dateDebutSupp, Date dateFinSupp, double calculNbSupp) {
	super();
	this.nbHeure = nbHeure;
	this.dateDebutSupp = dateDebutSupp;
	this.dateFinSupp = dateFinSupp;
	this.calculNbSupp = calculNbSupp;
}
public Long getIdHeure() {
	return idHeure;
}
public void setIdHeure(Long idHeure) {
	this.idHeure = idHeure;
}
public double getNbHeure() {
	return nbHeure;
}
public void setNbHeure(double nbHeure) {
	this.nbHeure = nbHeure;
}
public Date getDateDebutSupp() {
	return dateDebutSupp;
}
public void setDateDebutSupp(Date dateDebutSupp) {
	this.dateDebutSupp = dateDebutSupp;
}
public Date getDateFinSupp() {
	return dateFinSupp;
}
public void setDateFinSupp(Date dateFinSupp) {
	this.dateFinSupp = dateFinSupp;
}
public double getCalculNbSupp() {
	return calculNbSupp;
}
public void setCalculNbSupp(double calculNbSupp) {
	this.calculNbSupp = calculNbSupp;
}
public Salaires getSalaire() {
	return salaire;
}
public void setSalaire(Salaires salaire) {
	this.salaire = salaire;
}

}
