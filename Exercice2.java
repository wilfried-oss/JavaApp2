
public class Exercice2 {
	/*
	 * static signifie que la variable ident est une variable de classe
	 * 
	 * */
	private static int ident = 0;
	
	
	// A chaque nouvelle instance, on incrémente la valeur de ident
	public Exercice2() {
		ident++;
	}
	
	/**
	 * getIdent() est une méthode classe car elle ne manipule
	 * que des variables de classe. Elle renvoie le numéro du dernier objet crée.
	 * L'idée est simple, au début est vaut 0 et à chaque instance (la valeur de ident s'incremente) 
	 * elle renvoie la nouvelle valeur de ident. 
	 * 
	 * */
	public static int getIdentMax() {
		return ident;
	}
	
	public int getIdent() {
		return getIdentMax();
	}
	
}
