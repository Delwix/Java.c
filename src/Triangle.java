
public class Triangle extends Forme{

	protected double base;
	protected double hauteur;
	
	
	public void afficher() {
		System.out.println(" C'est un triangle");
	}
	
	public double surface() {
		return hauteur*base/2;
	}
}
