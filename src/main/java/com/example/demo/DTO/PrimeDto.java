package com.example.demo.DTO;

public class PrimeDto {
	private Long IdPrim;
	private double primDT;
	private String primepieceJoint;
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
	public String getPrimepieceJoint() {
		return primepieceJoint;
	}
	public void setPrimepieceJoint(String primepieceJoint) {
		this.primepieceJoint = primepieceJoint;
	}
}
