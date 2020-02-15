package exo3;

public class Etudiant extends Adherent implements PeutEmprunter{

	
	private String CIN ;
	private String CNE ;
	private String etablissm ;
	private Document docEmpr[] = new Document[3];
	
	private static int numDocEmpr=0;

	
	public Etudiant (String CIN, String CNE, String etablissm,Document docEmpr[]){
		this.CIN = CIN;
		this.CNE = CNE;
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
	
	public String getCIN() {
		return CIN;
	}
	
	public String getCNE() {
		return CNE;
	}
	
}