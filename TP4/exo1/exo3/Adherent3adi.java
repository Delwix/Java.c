package exo3;

public class Adherent3adi extends Adherent implements PeutEmprunter{

	
	private String nomComplet_CIN ;
	private String adrss ;
	private Document docEmpr[] = new Document[1];
	
	private static int numDocEmpr=0;

	
	public Adherent3adi(String nomComplet_CIN, String adrss,Document docEmpr[]){
		this.nomComplet_CIN = nomComplet_CIN;
		this.adrss = adrss;
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
		if (numDocEmpr<1) docEmpr[numDocEmpr]=d;
		numDocEmpr++;
	}
	
}
