package exo3;


public abstract class Document {
	
	protected int ISBN ;
	protected String titre ;
	protected String[] tabAuteur;
	protected String editeur;
	protected int anEdit;
	protected int nbrExemplaire;
	
	
//le numero d'enregistrement
	private static int numEnreg=0;
	
	
	public Document(int ISBN, String titre, String[] tabAuteur, String editeur, int anEdit, int nbrExemplaire) {
		this.ISBN=ISBN;
		this.titre=titre;
		this.tabAuteur=tabAuteur;
		this.editeur=editeur;
		this.anEdit=anEdit;
		this.nbrExemplaire=nbrExemplaire;
		numEnreg++;
	}

//getters
	public int getISBN() {
		return ISBN;
	}
	public String getTitre() {
		return titre;
	}
	public String[] getTabAuteur() {
		return tabAuteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public int getAnEdit() {
		return anEdit;
	}
	public int getNbrExemplaire() {
		return nbrExemplaire;
	}
	
//setters
	public void setISBN(int ISBN) {
		this.ISBN=ISBN;
	}
	public void setTitre(String titre) {
		this.titre=titre;
	}
	public void setTabAuteur(String[] tabAuteur) {
		this.tabAuteur=tabAuteur;
	}
	public void setEditeur(String editeur) {
		this.editeur=editeur;
	}
	public void setAnEdit(int anEdit) {
		this.anEdit=anEdit;
	}
	public void setNbrExemplaire(int nbrExemplaire) {
		this.nbrExemplaire=nbrExemplaire;
	}
	
//pour interdir le chgmt on change private par final ...
//on ne peut changer que le nbrExemplaire
	
	public int getNumero() {
		return numEnreg;
	}
 //on declare le num d'enreg comme final
	//c'est unique automatiquement car ne peut pas le modifier et il s'incremente...
	
	 public String toString () {
		 return " ISBN : " + this . ISBN +
		 " ,Titre : " + this . titre +
		 ", nombre d’exemplaires " + this . nbrExemplaire ;
		 }
	 
	 public void IncNbreEx (int x){
		 this . nbrExemplaire += x;
		 }
	 
	 public void DecNbreEx (int x){
		 this . nbrExemplaire -= x;
	 }
	 
	 public String destruct() {
		 return "  le document ayant les infos suivants est ''detruit'' ISBN : " + this . ISBN +
		 " ,Titre : " + this . titre +
		 ", nombre d’exemplaires " + this . nbrExemplaire ;
		 }
	 
}
		 
	
