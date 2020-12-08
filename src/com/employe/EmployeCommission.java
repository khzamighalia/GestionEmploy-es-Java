package com.employe;

public class EmployeCommission extends Employe {
	private double salaire;
	private int ventes, commission;

	public EmployeCommission(String nom, String prenom, double salaire, int ventes, int commission) {
		super(nom, prenom);
		this.salaire = salaire;
		this.ventes = ventes;
		this.commission = commission;
	}
	
	public double calculSalaire() {
		return salaire + (ventes * commission) / 100;
	}
	
	public String toString() {
		return super.toString() + ", Salaire total : " + calculSalaire();
	}
}
