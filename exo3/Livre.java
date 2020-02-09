package exo3;

public class Livre extends Document{
	
	private int nbrePages ;
	private String type ;
	private int tome ;
	
	public Livre (int ISBN, String titre, String[] tabAuteur, String editeur, int anEdit, int nbrExemplaire,int nbrePages, String type, int tome){
		super( ISBN,  titre, tabAuteur,  editeur,  anEdit,  nbrExemplaire);		
		this.nbrePages = 0;
		this.type = " indef ";
		this.tome = 0;
	}
	
	public String toString () {
		return super.toString() + this .nbrePages +	" ,type " + this . type +", tome " + this . tome ;
	}

}
