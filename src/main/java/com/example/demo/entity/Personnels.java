package com.example.demo.entity;

import java.io.Serializable;

import java.util.Collection;
import java.util.Date;
import java.util.List;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Personnels implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPers;
	private String matricul;
	private String nomPers;
	private String prenomPers;
	@Override
	public String toString() {
		return "Personnels [idPers=" + idPers + ", matricul=" + matricul + ", nomPers=" + nomPers + ", prenomPers="
				+ prenomPers + ", cin=" + cin + ", dateNaissancce=" + dateNaissancce + ", lieu=" + lieu + ", genre="
				+ genre + ", tel=" + tel + ", mobil=" + mobil + ", dateEmbauche=" + dateEmbauche + ", photo=" + photo
				+ ", dateFinContrat=" + dateFinContrat + ", login=" + login + ", mdp=" + mdp + ", adressePers="
				+ adressePers + ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays + ", contrat="
				+ contrat + ", numSecurSos=" + numSecurSos + ", situationFamille=" + situationFamille + ", nbEnfant="
				+ nbEnfant + ", experiance=" + experiance + ", conge=" + conge + ", fonctions=" + fonctions
				+ ", salaires=" + salaires + ", departements=" + departements + "]";
	}
	private int cin;
    @Temporal(TemporalType.DATE)
	private Date dateNaissancce;
	private String lieu;
	private String genre;
	private int tel;
	private int mobil;
    @Temporal(TemporalType.DATE)
	private Date dateEmbauche;
	private String photo;
    @Temporal(TemporalType.DATE)
	private Date dateFinContrat;
	private String login;
	private String mdp;
	private String adressePers,codePostal,ville,pays;
	private String contrat;
	private String numSecurSos;
	private String situationFamille;
	private int nbEnfant;
	@JsonIgnore
	@OneToOne (cascade = CascadeType.ALL)
	private Experiances experiance;

	//@JsonIgnore
	@OneToMany(mappedBy="personnels",cascade = CascadeType.ALL)
	private Collection<Conges> conge ;
	@OneToMany(mappedBy="personnels",cascade = CascadeType.ALL)
	private Collection<Fonctions> fonctions ;
	@OneToOne(cascade = CascadeType.ALL)
	private Salaires salaires;
	//@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
    private Departements departements ;
	public Personnels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personnels(String matricul, String nomPers, String prenomPers, int cin, Date dateNaissancce, String lieu,
			String genre, int tel, int mobil, Date dateEmbauche, String photo, Date dateFinContrat, String login,
			String mdp, String adressePers, String codePostal, String ville, String pays, String contrat,
			String numSecurSos, String situationFamille, int nbEnfant) {
		super();
		this.matricul = matricul;
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.cin = cin;
		this.dateNaissancce = dateNaissancce;
		this.lieu = lieu;
		this.genre = genre;
		this.tel = tel;
		this.mobil = mobil;
		this.dateEmbauche = dateEmbauche;
		this.photo = photo;
		this.dateFinContrat = dateFinContrat;
		this.login = login;
		this.mdp = mdp;
		this.adressePers = adressePers;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.contrat = contrat;
		this.numSecurSos = numSecurSos;
		this.situationFamille = situationFamille;
		this.nbEnfant = nbEnfant;
	}
	
	public Long getIdPers() {
		return idPers;
	}
	public void setIdPers(Long idPers) {
		this.idPers = idPers;
	}
	public String getMatricul() {
		return matricul;
	}
	public void setMatricul(String matricul) {
		this.matricul = matricul;
	}
	public String getNomPers() {
		return nomPers;
	}
	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}
	public String getPrenomPers() {
		return prenomPers;
	}
	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}
	public int getcin() {
		return cin;
	}
	public void setcin(int cin) {
		this.cin = cin;
	}
	public Date getDateNaissancce() {
		return dateNaissancce;
	}
	public void setDateNaissancce(Date dateNaissancce) {
		this.dateNaissancce = dateNaissancce;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getMobil() {
		return mobil;
	}
	public void setMobil(int mobil) {
		this.mobil = mobil;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getDateFinContrat() {
		return dateFinContrat;
	}
	public void setDateFinContrat(Date dateFinContrat) {
		this.dateFinContrat = dateFinContrat;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getAdressePers() {
		return adressePers;
	}
	public void setAdressePers(String adressePers) {
		this.adressePers = adressePers;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getContrat() {
		return contrat;
	}
	public void setContrat(String contrat) {
		this.contrat = contrat;
	}
	public String getNumSecurSos() {
		return numSecurSos;
	}
	public void setNumSecurSos(String numSecurSos) {
		this.numSecurSos = numSecurSos;
	}
	public String getsituationFamille() {
		return situationFamille;
	}
	public void setsituationFamille(String situationFamille) {
		situationFamille = situationFamille;
	}
	public int getNbEnfant() {
		return nbEnfant;
	}
	public void setNbEnfant(int nbEnfant) {
		this.nbEnfant = nbEnfant;
	}
	public Experiances getExperiance() {
		return experiance;
	}
	public void setExperiance(Experiances experiance) {
		this.experiance = experiance;
	}
	public Collection<Conges> getConge() {
		return conge;
	}
	public void setConge(Collection<Conges> conge) {
		this.conge = conge;
	}
	
	public Collection<Fonctions> getFonctions() {
		return fonctions;
	}
	public void setFonctions(Collection<Fonctions> fonctions) {
		this.fonctions = fonctions;
	}
	public Salaires getSalaires() {
		return salaires;
	}
	public void setSalaires(Salaires salaires) {
		this.salaires = salaires;
	}
	public Departements getDepartements() {
		return departements;
	}
	public void setDepartements(Departements departements) {
		this.departements = departements;
	}
	
}
