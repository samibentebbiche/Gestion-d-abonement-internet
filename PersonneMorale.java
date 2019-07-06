
public class PersonneMorale extends Client{
//Attributs
private String RS;//raison sociale pouvant etre enum
private int NRC;//Numero de registre de commerce 

//Constructor
public PersonneMorale(int numClient, String numTel, String adresse, String rS, int nRC) {
	super(numClient, numTel, adresse);
	RS = rS;
	NRC = nRC;
}
public PersonneMorale(int numClient, String numTel, String adresse) {
	super(numClient, numTel, adresse);
}

//Getters and setters
public String getRS() {
	return RS;
}
public void setRS(String rS) {
	RS = rS;
}
public int getNRC() {
	return NRC;
}
public void setNRC(int nRC) {
	NRC = nRC;
}

//Methods

}
