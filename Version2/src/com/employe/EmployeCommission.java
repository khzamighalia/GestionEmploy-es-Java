package com.employe;

public class EmployeCommission extends Employe {
	private double salaire, ventes;
	private int commission;

	public EmployeCommission(String nom, String prenom, double salaire, double ventes, int commission) {
		super(nom, prenom);
		this.salaire = salaire;
		this.ventes = ventes;
		this.commission = commission;
	}
	
	public double calculSalaire() {
		return salaire + (ventes * commission) / 100;
	}
	
	public String toString() {
		return super.toString() + " Salaire =" + calculSalaire() + " Dhs ";
	}

	@Override
	public void afficherEmployer() {
		System.out.println(toString());
	}
}
