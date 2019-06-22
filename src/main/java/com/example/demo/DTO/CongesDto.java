package com.example.demo.DTO;

import java.util.Date;

public class CongesDto {
	private Long idConge;
	private Date dateDebutConge;
	private Date dateFinConge;
	private int nbJour;
	public Long getIdConge() {
		return idConge;
	}
	public void setIdConge(Long idConge) {
		this.idConge = idConge;
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
	public int getNbJour() {
		return nbJour;
	}
	public void setNbJour(int nbJour) {
		this.nbJour = nbJour;
	}
	public String getCongdroits() {
		return Congdroits;
	}
	public void setCongdroits(String congdroits) {
		Congdroits = congdroits;
	}
	private String Congdroits;


}
