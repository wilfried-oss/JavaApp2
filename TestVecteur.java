
public class TestVecteur {
	public static void main(String[] args) {
		Vecteur3d point1 = new Vecteur3d(1, 1, 1);
		point1.affiche();
		System.out.println("La norme du vecteur " + point1.norme());
		Vecteur3d.sommeDeuxVecteurs(point1, point1).affiche();
		double var = Vecteur3d.sommeDeuxVecteurs(point1, point1).norme();
		System.out.println("La norme de la résultante " + var);
		System.out.println();
		System.out.println("Testons le produit scalaire.");
		System.out.println(point1.produitScalaire(point1));
	}
}
