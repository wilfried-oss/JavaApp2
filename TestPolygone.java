import java.util.*;
public class TestPolygone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Testons notre classe Polygone. \n");
		Polygone carre = new Polygone(4, 3);
		
		System.out.println();
		Polygone triangle = new Polygone();
		
		triangle.setNombreCote(3);
		triangle.setLongueurCote(3);
		
		System.out.println(carre.toString());
		carre.presqueClone(1);
		
		System.out.println(carre.toString());
		
		System.out.print("Indiquer le nombre de côtés à augmenter au triangle : ");
		int nombreCoteAugmente = sc.nextInt();
		triangle.presqueClone(nombreCoteAugmente);
		System.out.println(triangle.toString());
		
			
	}
}
