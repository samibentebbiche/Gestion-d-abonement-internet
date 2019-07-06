import java.util.Date;

public class AbonnementPro extends Abonnement {
//Attribut
private PersonneMorale PM;

//Constructors
public AbonnementPro() {super();}
public AbonnementPro(CategorieCnx categorie, Date dateDebCnx, Date finCnx, Date dernierPaiment,PersonneMorale PM) {
		super(categorie, dateDebCnx, finCnx, dernierPaiment);
		this.PM=PM;
	}

//Getter & Setter 
public PersonneMorale getPM() {
	return PM;
}

public void setPM(PersonneMorale pM) {
	PM = pM;
}
	

}
