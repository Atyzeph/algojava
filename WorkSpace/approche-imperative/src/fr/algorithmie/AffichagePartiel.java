package fr.algorithmie;

public class AffichagePartiel {
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Afficher entier supérieur à 3
		
		System.out.println("Valeurs supérieures à 3 : ");
		for (int i = 0; i <= array.length-1; i++ ) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		// Afficher entier pair
		
		System.out.println("Valeurs pair : ");
		for (int i = 0; i <= array.length-1; i++ ) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		
		// Afficher valeurs d'index pair
		
		System.out.println("Valeurs d'index pair : ");
		for (int i = 0; i <= array.length-1; i++ ) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}		
		
		// Afficher entier impair
		
		System.out.println("Valeurs impair : ");
		for (int i = 0; i <= array.length-1; i++ ) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
	}
}
