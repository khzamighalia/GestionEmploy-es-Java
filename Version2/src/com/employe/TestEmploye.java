package com.employe;

public class TestEmploye {

	public static void main(String[] args) {
		EmployeFixe employeFixe = new EmployeFixe("nom1", "prenom1", 5000);
		EmployeCommission employeCommission =new EmployeCommission("nom2", "prenom2", 4000, 24000, 10);
		EmployeHoraire employeHoraire = new EmployeHoraire("nom3", "prenom3", 30, 150);
		
		employeFixe.affichierEmployer();
		employeCommission.affichierEmployer();
		employeHoraire.affichierEmployer();
	}

}
