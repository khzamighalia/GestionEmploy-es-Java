package com.employe;

public class EmployeHoraire extends Employe {
	private double taux_horaire;
	private int heures;
	
	public EmployeHoraire(String nom, String prenom, double taux_horaire, int heures) {
		super(nom, prenom);
		this.taux_horaire = taux_horaire;
		this.heures = heures;
	}

	@Override
	public String toString() {
		return super.toString()+ " Salaire ="+calculSalaire()+ " Dhs ";
	}


	public double calculSalaire() {
		return taux_horaire*heures;
	}


}
