package exo3;

public class Etudiant implements PeutEmprunter{

	
	private String nomComplet_CIN ;
	private String etablissm ;
	private Document docEmpr[] = new Document[3];
	
	private static int numDocEmpr=0;

	
	public Etudiant (String nomComplet_CIN, String etablissm,Document docEmpr[]){
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
		if (numDocEmpr<3) docEmpr[numDocEmpr]=d;
		numDocEmpr++;
	}
	
}