package fr.boucles;

public class ExerciceBoucleBase {
	public static void main(String[] args) {
		
		// Nombres de 1 à 10
		for (int nb = 1; nb <= 10; nb++) {
			System.out.println(nb);
		}
		
		// Affichage nom et prénom
		for (int name = 1; name <= 20; name++) {
			System.out.println(name + " - Bennetot Clément");
		}
		
		// Affichage nb pair 2-100
		for (int nbPair = 2; nbPair <= 100; nbPair++) {
			if (nbPair % 2 == 0) {
				System.out.println(nbPair);
			}
		}
		
		// Affichage nb impair 1-99
		for (int nbImpair = 0; nbImpair <= 100; nbImpair++) {
			if (nbImpair % 2 != 0) {
				System.out.println(nbImpair);
			}
		}
	}
}
