
public class TestExo2 {
	public static void main(String[] args) {
		System.out.println("TEST DE LA CLASSE EXERCICE 2");
		Exercice2[] tableauInstance = new Exercice2[5];
		
		for(int i = 0; i < 5; i++) {
			tableauInstance[i] = new Exercice2();
			System.out.println("Le numéro attribué  à l'objet " + i + " est " + tableauInstance[i].getIdent());
		}		
		
		
		
		System.out.println("Une nouvelle instance de la classe.");
		Exercice2 instanceNouvelle = new Exercice2();
		
		instanceNouvelle.getIdent();
		
		
		System.out.println();
		System.out.println("TEST DE LA CLASSE EXERCICE 3");
		Exercice3.askvalue();
		
		System.out.println("Une nouvelle instance de la classe.");
		Exercice3 objet1 = new Exercice3();
		
		System.out.println("Le numéro du premier objet est  : " + objet1.getIdent());
		
		Exercice3[] tableauInstances = new Exercice3[5];
		
		for(int i = 0; i < 5; i++) {
			tableauInstances[i] = new Exercice3();
			System.out.println("Le numéro attribué  à l'objet " + i + " est " + tableauInstances[i].getIdent());
		}
		
	}
}
