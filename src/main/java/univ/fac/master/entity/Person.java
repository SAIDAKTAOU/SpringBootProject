package univ.fac.master.entity;

public class Person {
Long id;
String nom;
int age;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(Long id, String nom, int age) {
	super();
	this.id = id;
	this.nom = nom;
	this.age = age;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
