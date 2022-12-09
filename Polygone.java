
public class Polygone {
	private int nombreCote;
	private double longueurCote;
	private double perimetre;
	

	/**
	 * @param nombreCote
	 * @param longueurCote
	 */
	public Polygone() {
		this.nombreCote = 0;
		this.longueurCote = 0;
		this.perimetre = 0;
	}
	

	/**
	 * @param nombreCote
	 * @param longueurCote
	 */
	public Polygone(int nombreCote, double longueurCote) {
		this.nombreCote = nombreCote;
		this.longueurCote = longueurCote;
		this.perimetre = this.nombreCote * this.longueurCote;
	}
	
	@Override
	public String toString() {
		return "Nombre Cote = " + nombreCote + "\nLongueur Cote = " + longueurCote + "\nPérimètre = " + perimetre + "\n";
	}
	
	public int getNombreCote() {
		return nombreCote;
	}
	
	public void setNombreCote(int nombreCote) {
		this.nombreCote = nombreCote;
	}
	
	public double getLongueurCote() {
		return longueurCote;
	}
	
	public void setLongueurCote(double longueurCote) {
		this.longueurCote = longueurCote;
	}
	
	public double perim() {
		return nombreCote * longueurCote;
	}
	
	public void presqueClone(int nbr) {
		nombreCote += nbr;
	}
	
	
	public Polygone plusPetit(Polygone polygone) {
		if(perimetre < polygone.perimetre)
			return this;
		return polygone;
	}
}
