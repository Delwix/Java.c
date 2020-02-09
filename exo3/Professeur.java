package exo3;

public class Professeur implements PeutEmprunter{
	
	private String nomComplet_CIN ;
	private String etablissm ;
	private Document docEmpr[] = new Document[5];
	
	private static int numDocEmpr=0;

	
	public Professeur (String nomComplet_CIN, String etablissm,Document docEmpr[]){
		this.nomComplet_CIN = nomComplet_CIN;
		this.etablissm = etablissm;
		this.docEmpr=docEmpr.clone();
	}

	public String aEmprunte() {
		String info=new String("");
		for(Document d : this.docEmpr) {
			info+=d.toString() + "\n";
		}
		return info;
	}
	
	public void emprunte(Document d) {
		if (numDocEmpr<5) docEmpr[numDocEmpr]=d;
		numDocEmpr++;
	}
	
}
