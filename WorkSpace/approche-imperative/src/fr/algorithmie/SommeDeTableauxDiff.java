package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
		
		int[] somme = new int[array1.length];
		int i = 0;
		
		// La boucle se réfère au tableau le plus petit pour faire le calcul de la somme
		
		for (i = 0; i < array2.length; i++) {
			
			System.out.println(somme[i] = array1[i] + array2[i]);
				
			}
		
		// Ce block prend le relais si la première boucle arrive au bout du premier tableau
		
		if (i >= array2.length) {
			for (int j = array2.length; j < array1.length; j++) {
				System.out.println(somme[i] = array1[j]);
			}
		}
	}

}
