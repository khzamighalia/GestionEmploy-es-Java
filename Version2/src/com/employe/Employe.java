package com.employe;

public class Employe {

  private String nom;
	private String prenom;
	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return " Nom=" + nom + ", prenom=" + prenom + ",";
	}


}
