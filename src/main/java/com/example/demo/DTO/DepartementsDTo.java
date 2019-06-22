package com.example.demo.DTO;

import org.modelmapper.ModelMapper;

import com.example.demo.entity.Departements;

public class DepartementsDTo {
	private int numDept;
	private String nomDept;
	
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
