import java.util.*;
public class Exercice3 {
	private static int ident;
	
	public Exercice3() {
		ident++;
	}
	
	/*
	 * On décide de donner au user la posibilité de renseigner le numero initial
	 * On choisit d'utiliser une méthode statique pour la cause.
	 * */
	public static void askvalue() {
		
		// le user renseigne la valeur au clavier
		
		System.out.print("Entrez la valeur du numéro initial :");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		/**
		 * On controle avec la boucle while la valeur entrée par le user
		 * Tant que la valeur est négative, on redemande au user de renseigner la valeur.
		 * 
		 * */
		
		while(numero < 0) {
			System.out.println("Le numéro initial doit être positif.");
			System.out.print("Entrez la valeur du numéro initial :");
			sc = new Scanner(System.in);
			numero = sc.nextInt();
		}
		
		/**
		 * 	On sort de la boucle uniquement quand la valeur saisie est positive
		 * 	on affecte cette valeur à ident
		 * */
		if(numero > 0)
			ident = numero;
	}
	
	/**
	 * 	Même commentaires que pour Exo2
	 * 
	 * */
	public static int getIdentMax() {
		return ident;
	}
	
	public int getIdent() {
		return getIdentMax();
	}
}
