package fr.boucles;

import java.util.Iterator;

public class ExerciceTableauEntier {
	public static void main(String[] args) {
		
		int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Afficher le premier élément
		System.out.println(tab1[0]);
		
		// Afficher longueur
		System.out.println(tab1.length);
		
		// Afficher dernier élément (J'ai passé une heure dessus)
		for (int i = 0; i <= tab1.length; i++ ) {
			if (i == tab1.length-1) {
				System.out.println(tab1[i]);
			}
		}
		
		// Modifier élément 4
		for (int i = 0; i < tab1.length; i++ ) {
				tab1[3] = 8;
			System.out.println(tab1[i]);
		}
	}
}
