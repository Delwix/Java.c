
public abstract class Forme {
	protected double xCentre;
	protected double yCentre;
	
	public double getX() {
		return this.xCentre;
	}
	 
	public double getY() {
		return this.yCentre;
	}
	
	public void setX(double x) {
		this.xCentre=x;
	}
	public void setY(double y) {
		this.yCentre=y;
	}
	
	public abstract void afficher();
	
	public double estDistantDe(Forme f) {
		//ne doit pas etre declaree abstract car c la meme pour toute les formes
		return Math.sqrt(Math.pow(f.xCentre-this.xCentre, 2)-Math.pow(f.yCentre-this.yCentre, 2));
	}

	
	public abstract double surface(); // abstract car chaque forme a sa propre formule
	
	public void deplacement(int x, int y ) {
		//pas abstract car c la meme procedure pour toutes les formes
		this.xCentre+=x;
		this.yCentre+=y;
	}
	










}
	
	
