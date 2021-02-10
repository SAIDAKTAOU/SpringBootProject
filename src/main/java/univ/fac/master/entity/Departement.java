package univ.fac.master.entity;

import java.util.Hashtable;

public class Departement {
	
String nom;
Hashtable<String,Person> employee;
public Departement() {
	super();
	// TODO Auto-generated constructor stub
}
public Departement(String nom, Hashtable<String, Person> employee) {
	super();
	this.nom = nom;
	this.employee = employee;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Hashtable<String, Person> getEmployee() {
	return employee;
}
public void setEmployee(Hashtable<String, Person> employee) {
	this.employee = employee;
}


}
