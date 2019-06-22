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
public class Conges implements Serializable {
	@Override
	public String toString() {
		return "Conges [idConge=" + idConge + ", typeConge=" + typeConge + ", dateDebutConge=" + dateDebutConge
				+ ", dateFinConge=" + dateFinConge + ", motif=" + motif + ", nbJour=" + nbJour + ", droits=" + droits
				+ ", congeDejaPris=" + congeDejaPris + ", coungeApprové=" + coungeApprové + ", soldeDispo=" + soldeDispo
				+ ", personnels=" + personnels + "]";
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idConge;
private String typeConge;
private Date dateDebutConge;
private Date dateFinConge;
private String motif;
private int nbJour;
private String droits;
private int congeDejaPris;
private double coungeApprové;
private double soldeDispo;
@JsonIgnore
@ManyToOne(fetch = FetchType.EAGER)
private Personnels personnels ;
public Conges() {
	super();
	// TODO Auto-generated constructor stub
}
public Conges(String typeConge, Date dateDebutConge, Date dateFinConge, String motif, int nbJour, String droits,
		int congeDejaPris, double coungeApprové, double soldeDispo) {
	super();
	this.typeConge = typeConge;
	this.dateDebutConge = dateDebutConge;
	this.dateFinConge = dateFinConge;
	this.motif = motif;
	this.nbJour = nbJour;
	this.droits = droits;
	this.congeDejaPris = congeDejaPris;
	this.coungeApprové = coungeApprové;
	this.soldeDispo = soldeDispo;
}
public Long getIdConge() {
	return idConge;
}
public void setIdConge(Long idConge) {
	this.idConge = idConge;
}
public String getTypeConge() {
	return typeConge;
}
public void setTypeConge(String typeConge) {
	this.typeConge = typeConge;
}
public Date getDateDebutConge() {
	return dateDebutConge;
}
public void setDateDebutConge(Date dateDebutConge) {
	this.dateDebutConge = dateDebutConge;
}
public Date getDateFinConge() {
	return dateFinConge;
}
public void setDateFinConge(Date dateFinConge) {
	this.dateFinConge = dateFinConge;
}
public String getMotif() {
	return motif;
}
public void setMotif(String motif) {
	this.motif = motif;
}
public int getNbJour() {
	return nbJour;
}
public void setNbJour(int nbJour) {
	this.nbJour = nbJour;
}
public String getDroits() {
	return droits;
}
public void setDroits(String droits) {
	this.droits = droits;
}
public int getCongeDejaPris() {
	return congeDejaPris;
}
public void setCongeDejaPris(int congeDejaPris) {
	this.congeDejaPris = congeDejaPris;
}
public double getCoungeApprové() {
	return coungeApprové;
}
public void setCoungeApprové(double coungeApprové) {
	this.coungeApprové = coungeApprové;
}
public double getSoldeDispo() {
	return soldeDispo;
}
public void setSoldeDispo(double soldeDispo) {
	this.soldeDispo = soldeDispo;
}
public Personnels getPersonnel() {
	return personnels;
}
public void setPersonnel(Personnels personnels) {
	this.personnels = personnels;
}

}
