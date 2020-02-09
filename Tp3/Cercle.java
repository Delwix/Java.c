
public class Cercle extends Forme{
	
	protected double rayon;
	
	
	public void afficher() {
		System.out.println(" C'est un cercle");
	}
	
	public double surface() {
		return Math.PI*Math.pow(rayon, 2);
	}

}
