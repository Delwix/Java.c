package exo3;

public class Magazine extends Document{
	

	private String periodicite ;
	private int moisEdition ;
	private int jour ;
	
	public Magazine (int ISBN, String titre, String[] tabAuteur, String editeur, int anEdit, int nbrExemplaire,String periodicite,int moisEdition, int jour){
		super( ISBN,  titre, tabAuteur,  editeur,  anEdit,  nbrExemplaire);
		this.periodicite = periodicite;
		this.moisEdition = moisEdition;
		this.jour = jour;
	}
	
	public String toString () {
	return super.toString()+ " periodicite :" + this .periodicite + " ,mois d’edition : " + this . moisEdition + ", jour :" + this . jour ;
}
	
}
