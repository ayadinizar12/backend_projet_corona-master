package com.angular.springboot.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laboratoire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idLab ;
    public long getIdLab() {
		return idLab;
	}
	public void setIdLab(long idLab) {
		this.idLab = idLab;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	public Laboratoire() {
		super();
	}
	private String nom ;
    private String adresse ;
    private int numTel ;
    
    @OneToMany(mappedBy="laboratoire")
    private List<ReservationTestPCR> rsvTestPCR ;
}
