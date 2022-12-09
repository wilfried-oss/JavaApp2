
public class Vecteur3d {
	private double x;
	private double y;
	private double z;
	
	public Vecteur3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public void affiche() {
		System.out.println("Affichage d'un Point : ");
		System.out.println(" < composante1 : " + x + " , composante2 : " + y + " , composante3 : " + z + " >");
	}
	
	public double norme() {
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	public static Vecteur3d sommeDeuxVecteurs(Vecteur3d vecteur1, Vecteur3d vecteur2) {
		Vecteur3d resultante = new Vecteur3d(0, 0, 0);
		resultante.x = vecteur1.x + vecteur2.x;
		resultante.y = vecteur1.y + vecteur2.y;
		resultante.z = vecteur1.z + vecteur2.z;
		return resultante;
	}
	
	public double produitScalaire(Vecteur3d vecteur) {
		return (x * vecteur.x + y * vecteur.y + z * vecteur.z);
	}
}
P