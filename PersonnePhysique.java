import java.util.Date;

public class PersonnePhysique extends Client{
//Attributs
private int NPI;//Numero de piece d'identité
private String nom;
private String prenom;
private Date datenaiss;//date de naissance

//Constructor
public PersonnePhysique(int numClient, String numTel, String adresse, int nPI, String nom, String prenom,
		Date datenaiss) {
	super(numClient, numTel, adresse);
	NPI = nPI;
	this.nom = nom;
	this.prenom = prenom;
	this.datenaiss = datenaiss;
}
public PersonnePhysique(int numClient, String numTel, String adresse) {
	super(numClient, numTel, adresse);
}

//Getters and setters
public int getNPI() {
	return NPI;
}
public void setNPI(int nPI) {
	NPI = nPI;
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
public Date getDatenaiss() {
	return datenaiss;
}
public void setDatenaiss(Date datenaiss) {
	this.datenaiss = datenaiss;
}

//Methods


}
