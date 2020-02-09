
public class Carre extends Forme implements Deformable{
	
	protected double longueurCote;
	
	public void afficher() {
		System.out.println(" C'est un carre");
	}
	
	public Forme deformation(double coeffH, double coeffV) {
		Rectangle rect=new Rectangle();
		rect.hauteur=this.longueurCote*coeffV;
		rect.largeur=this.longueurCote*coeffH;
		return rect;
	}
	
	public double surface() {
		return Math.pow(longueurCote, 2);
	}
}
