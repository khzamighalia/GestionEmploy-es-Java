package com.employe;

public class EmployeFixe extends Employe {

  private Double Salaire;

	public EmployeFixe(String nom, String prenom, Double salaire) {
		super(nom, prenom);
		Salaire = salaire;
	}

	@Override
	public String toString() {
		return super.toString()+" Salaire =" + Salaire + " Dhs ";
	}
}
