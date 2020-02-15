package exo3;

public class Dictionnaire extends Document{
	
	private String langue ;
	private int nbreTomes ;
	
	public Dictionnaire(int ISBN, String titre, String[] tabAuteur, String editeur, int anEdit, int nbrExemplaire,String langue, int  nbreTomes){
		super( ISBN,  titre, tabAuteur,  editeur,  anEdit,  nbrExemplaire);
		this.langue = langue;
		this.nbreTomes = nbreTomes;
	}
	
	public String toString () {
	return super.toString() + " langue :" + this . langue +
	" ,nombre de tomes : " + this . nbreTomes ;
	}

}
