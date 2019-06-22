package com.example.demo.DTO;

import java.util.Date;

public class HeureSupplementaireDto {
	private double nbHeure;
	private double calculNbSupp;
	public double getNbHeure() {
		return nbHeure;
	}
	public void setNbHeure(double nbHeure) {
		this.nbHeure = nbHeure;
	}
	public double getCalculNbSupp() {
		return calculNbSupp;
	}
	public void setCalculNbSupp(double calculNbSupp) {
		this.calculNbSupp = calculNbSupp;
	}
	public Date getHsdateDebutSupp() {
		return HsdateDebutSupp;
	}
	public void setHsdateDebutSupp(Date hsdateDebutSupp) {
		HsdateDebutSupp = hsdateDebutSupp;
	}
	private Date HsdateDebutSupp;


}
