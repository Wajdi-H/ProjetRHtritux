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
public class Prime implements Serializable{
	@Override
	public String toString() {
		return "Prime [IdPrim=" + IdPrim + ", primDT=" + primDT + ", pieceJoint=" + pieceJoint + ", salaire=" + salaire
				+ "]";
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdPrim;
	private double primDT;
	private String pieceJoint;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	private Salaires salaire ;

	public Prime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prime(double primDT, String pieceJoint) {
		super();
		this.primDT = primDT;
		this.pieceJoint = pieceJoint;
	}
	public Long getIdPrim() {
		return IdPrim;
	}
	public void setIdPrim(Long idPrim) {
		IdPrim = idPrim;
	}
	public double getPrimDT() {
		return primDT;
	}
	public void setPrimDT(double primDT) {
		this.primDT = primDT;
	}
	public String getPieceJoint() {
		return pieceJoint;
	}
	public void setPieceJoint(String pieceJoint) {
		this.pieceJoint = pieceJoint;
	}
	public Salaires getSalaire() {
		return salaire;
	}
	public void setSalaire(Salaires salaire) {
		this.salaire = salaire;
	}
		

}
