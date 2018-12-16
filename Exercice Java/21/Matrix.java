package matrix;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
		/*Exercice 21
		 *Ecrivez le programme Java qui lit deux matrices carrées dont la taille est fixée par une constante, en calcule la
		 *somme puis affiche le résultat .
		 *Indice : la somme de deux matrices se fait élément par élément . Si A et B sont les deux matrices dont C est la
		 *somme, alors pour toute paire d'indices i et j, Cij=Aij+Bij
		 */
		final int ligne = 2;
		final int colonne = 3;
		
		int tableauA[][] = new int [ligne] [colonne];
		int tableauB[][] = new int [ligne] [colonne];

		int tableauC[][] = new int [ligne] [colonne];

		System.out.println("Randomisation du premier tableau:");
		
		for (int i = 0; i < ligne; i++) {
			for (int j = 0; j < colonne; j++) {
				tableauA[i][j] = (int) (Math.random() * 101); //Entre 0 et 100
			}
		}
		
		System.out.println("Affichage du premier tableau:");
		System.out.println(Arrays.deepToString(tableauA));
		System.out.println("Randomisation du deuxieme tableau:");
		
		for (int i = 0; i < ligne; i++) {
			for (int j = 0; j < colonne; j++) {
				tableauB[i][j] = (int) (Math.random() * 101); //Entre 0 et 100		
			}
		}
		
		System.out.println("Affichage du deuxieme tableau:");
		System.out.println(Arrays.deepToString(tableauB));
		
		for (int i = 0; i < ligne; i++) {
			for (int j = 0; j < colonne; j++) {
				tableauC[i][j] = tableauA[i][j] + tableauB[i][j];
				
			}
		}
		System.out.println("Affichage de la somme des deux tableau:");
		System.out.println(Arrays.deepToString(tableauC));
	}
}


