package fr.boucles;

public class ExerciceBouclesEtTests {
	public static void main(String[] args) {
		
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Afficher tableau
		
		for (int i = 0; i <= array.length-1; i++ ) {
				System.out.println(array[i]);
		}
		
		// Afficher dans l'ordre inverse
		
		for (int i = array.length-1; i >= 0; i-- ) {
			System.out.println(array[i]);
		}
		
		// Afficher seulement les valeurs supérieures à 3
		System.out.println("Valeurs supérieures à 3 : ");
		for (int i = 0; i <= array.length-1; i++ ) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		// Afficher seulement les valeurs pair
		System.out.println("Valeurs pair : ");
		for (int i = 0; i <= array.length-1; i++ ) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		// Afficher seulement les valeurs impair
		System.out.println("Valeurs impair : ");
		for (int i = 0; i <= array.length-1; i++ ) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
	}
}
