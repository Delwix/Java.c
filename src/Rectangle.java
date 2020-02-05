
public class Rectangle  extends Forme implements Deformable {
	
	protected double largeur;
	protected double hauteur;

	public void afficher() {
		System.out.println(" C'est un rectangle");
	}
	
	public Forme deformation(double coeffH, double coeffV) {
		Carre carre=new Carre();
		this.largeur*= coeffH; 
		this.hauteur*= coeffV;
		carre.longueurCote=this.largeur;
		return carre;
	}
	
	public double surface() {
		return this.hauteur*this.largeur;
	}
	
}