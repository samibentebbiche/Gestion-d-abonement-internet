import java.util.*;
public class Abonnement {
	
//Attributs
private CategorieCnx categorie;
private Date DateDebCnx;
private Date FinCnx;
private Date DernierPaiment;

//Constructers
public Abonnement(CategorieCnx categorie, Date dateDebCnx, Date finCnx, Date dernierPaiment) {
	this.categorie = categorie;
	this.DateDebCnx = dateDebCnx;
	this.FinCnx = finCnx;
	this.DernierPaiment = dernierPaiment;
}
public Abonnement() {}
//Getters & Setters
public CategorieCnx getCategorie() {
	return categorie;
}
public void setCategorie(CategorieCnx categorie) {
	this.categorie = categorie;
}
public Date getDateDebCnx() {
	return DateDebCnx;
}
public void setDateDebCnx(Date dateDebCnx) {
	DateDebCnx = dateDebCnx;
}
public Date getFinCnx() {
	return FinCnx;
}
public void setFinCnx(Date finCnx) {
	FinCnx = finCnx;
}
public Date getDernierPaiment() {
	return DernierPaiment;
}
public void setDernierPaiment(Date dernierPaiment) {
	DernierPaiment = dernierPaiment;
}

//Methods
//resilier() methode retournant true pour annulation et false pour maintenance(confirmation) , on ne relisilie pas qlq chose qui n'exixste pas , dérisilier vient apres resilier 
//etatAb() me donne l'etat de paiment de l'abonnement ou l'abonné s'il est en retard ou pas 
//affichage()
}
