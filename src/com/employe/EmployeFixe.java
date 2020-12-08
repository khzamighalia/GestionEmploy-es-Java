package com.employe;

public class EmployeFixe extends Employe {

  private double Salaire;

	public EmployeFixe(String nom, String prenom, double salaire) {
		super(nom, prenom);
		Salaire = salaire;
	}

	@Override
	public String toString() {
		return super.toString()+" Salaire =" + Salaire + " Dhs ";
	}
}
