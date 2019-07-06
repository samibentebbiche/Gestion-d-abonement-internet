import java.util.Date;

public class AbonnementResid extends Abonnement {
//Attribut
private PersonnePhysique PP;
//Constructors
public AbonnementResid() {
		super();
	}
public AbonnementResid(CategorieCnx categorie, Date dateDebCnx, Date finCnx, Date dernierPaiment,PersonnePhysique PP) {
		super(categorie, dateDebCnx, finCnx, dernierPaiment);
		this.PP=PP;
	}
//getter & setter
public PersonnePhysique getPP() {
	return PP;
}
public void setPP(PersonnePhysique PP) {
	this.PP = PP;
}

}
