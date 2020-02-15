package exo3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Bibliotheque{
		
	private List<Document> listeDoc=new LinkedList<>();
	private List<Adherent> listeAdh=new LinkedList<>();
	
	public Bibliotheque(List<Document> ld, List<Adherent> la) {
		this.listeDoc=new LinkedList<>(ld);
		this.listeAdh=new LinkedList<>(la);	
		
	}
	
	public String toString () {
		String doc="Ensemble de document :\n";
		for(int i=0;i<this.listeDoc.size();i++) {
			doc+=this.listeDoc.get(i).toString() +"\n";
		}
		String adh="Ensemble d'adherent :\n";
		for(int i=0;i<this.listeAdh.size();i++) {
			adh+=this.listeAdh.get(i).toString() +"\n";
		}
		return "la biblio est constituee d'un :\n" +doc+adh;
		
	}
	
	public Document[] getDocumentsByEditeur(String editeur) {
		Document ld[]=new Document[this.listeDoc.size()];
		int j=0;
		for(int i=0;i<this.listeDoc.size();i++) {
			if (this.listeDoc.get(i).editeur==editeur) {
				ld[j++]=this.listeDoc.get(i);
				}
		}
		return ld;
	}
	
	
	public Document getDocumentByISBN(int isbn) {
		int i=0;
		for(i=0;i<this.listeDoc.size();i++) {
			if (this.listeDoc.get(i).ISBN==isbn) break;
		}
		return this.listeDoc.get(i);
	}
	
	public LinkedList<Document> getDocumentsByAuteur(String Auteur){
		LinkedList<Document> ld=new LinkedList<Document>();
		boolean exists;
		for(int i=0;i<this.listeDoc.size();i++) {
			exists=false;
			for(String aut : this.listeDoc.get(i).tabAuteur) {
				if (Auteur==aut) { 
					exists=true;
					break;
				}
			}
			if(exists) ld.add(this.listeDoc.get(i));
		}
		return ld;
	}
	
	
	public LinkedList<Document> getDocumentsByTitle(String titre){
		LinkedList<Document> ld=new LinkedList<Document>();
		for(int i=0;i<this.listeDoc.size();i++) {
			if (this.listeDoc.get(i).getTitre() ==titre) {
				ld.add(this.listeDoc.get(i));
			}
		}
		return ld;
	}
	
	
	public Etudiant getEtudiantByCne(String cne) {
		int i=0;
		for(i=0;i<this.listeAdh.size();i++) {
			if (this.listeAdh.get(i) instanceof Etudiant & ((Etudiant) this.listeAdh.get(i)).getCNE() ==cne  ) break;
		}
		return ((Etudiant) this.listeAdh.get(i));
		
	}
	
	public Professeur getProfesseurByCin(String cin) {
		int i=0;
		for(i=0;i<this.listeAdh.size();i++) {
			if (this.listeAdh.get(i) instanceof Professeur & ((Professeur) this.listeAdh.get(i)).getCIN()==cin) 
				break;
		}
		return ((Professeur) this.listeAdh.get(i));
		
	}

//supprimer toutes les occurences in case sont repetes
	public boolean SupprimerDocument(String titre) {
		int i=0,j=0;
		for(i=0;i<this.listeDoc.size();i++) {
			if (this.listeDoc.get(i).getTitre() ==titre) {
				this.listeDoc.remove(this.listeDoc.get(i));
				j++;
			}
		}
		if(j>0) return true;
		return false;
	}
	
	
	public boolean SupprimerEtudiant(String cne) {
		int i=0,j=0;
		for(i=0;i<this.listeAdh.size();i++) {
			if (((Etudiant)this.listeAdh.get(i)).getCNE()==cne) {
				this.listeAdh.remove(this.listeAdh.get(i));
				j++;
			}
		}
		if(j>0) return true;
		return false;
	}
	
	public boolean SupprimerProfesseur(String cin) {
		int i=0,j=0;
		for(i=0;i<this.listeAdh.size();i++) {
			if (((Professeur)this.listeAdh.get(i)).getCIN()==cin) {
				this.listeAdh.remove(this.listeAdh.get(i));
				j++;
			}
		}
		if(j>0) return true;
		return false;
	}
	
	
	public boolean AjouterDocument(Document d) {
		if (this.listeDoc.contains(d)) {
			System.out.println("ce doc existe deja !!");
			return false;
		}
		return this.listeDoc.add(d);
	}
	
	public boolean AjouterAdherent(Adherent a) {
		if (this.listeAdh.contains(a)) {
			System.out.println("cet adhr existe deja !!");
			return false;
		}
		return this.listeAdh.add(a);
	}
	
	public LinkedList<Document> TrierAnneeAsc(){
		LinkedList<Document> listeDocAsc=new LinkedList<>();
		listeDocAsc=new LinkedList<>(this.listeDoc);
		listeDocAsc.sort(Comparator.comparing(Document::getAnEdit));
		return listeDocAsc;

	}
	
	public LinkedList<Document> TrierAnneeDesc(){
		LinkedList<Document> listeDocDesc=new LinkedList<>();
		listeDocDesc=new LinkedList<>(this.listeDoc);
		listeDocDesc.sort(Comparator.comparing(Document::getAnEdit).reversed());
		return listeDocDesc;

	}
	
	
	public Livre[] getLivreByType(String type) {
		Livre ll[]=new Livre[this.listeDoc.size()];
		int j=0;
		for(int i=0;i<this.listeDoc.size();i++) {
			if (this.listeDoc.get(i) instanceof Livre & ((Livre)this.listeDoc.get(i)).getType()==type) {
				ll[j++]=(Livre)this.listeDoc.get(i);
				}
		}
		return ll;
		
	}
	
	
	
}
	