package triabulle;


import java.util.Arrays;

public class Triabulle {

	public static void main(String[] args) {
		/*Exercice 19 Tri à bulle
		 *Déclarez et initialisez un tableau de 8 entiers.
		 *Remplir aléatoirement ce tableau avec des nombres entre 0 et 100.
		 *Afficher ce tableau en l'état.
		 *Ecrivez l'algorithme qui trie un tableau d'entiers dans l'ordre croissant.
		 *Ré-afficher le tableau une fois trié.
		 *comparer i et i +1 
		 */
		/******************
		 *******VAR********
		 ******************/
		int[] tableau = new int[8];
		boolean tryAgain;
		int temp = 0;


		/******************
		 *******DEBUT******
		 ******************/
		//Génération du nombre aléatoire 

		for(int i =0; i < tableau.length; i++) {
			tableau[i] = (int) (Math.random() * 101); //Entre 0 et 100		
		}

		System.out.println("votre tableau contient : " + Arrays.toString(tableau));

		// Arrays.sort(tableau); // tri le tableau mais ce n'est pas la réponse exacte

		do {
			System.out.println("La boucle commence !");

			tryAgain = false;

			for(int i = 0; i < tableau.length - 1; i++) {
				System.out.println(Arrays.toString(tableau));
				int tableauPlusUn = tableau[i + 1];

				System.out.println(tableau[i]);

				if (tableau[i] > tableauPlusUn) {

					System.out.println(tableau[i] + " est plus grand que " + tableauPlusUn);

					temp = tableau[i];				
					tableau[i] = tableauPlusUn;     /*fonction qui bouge les chiffre*/
					tableau[i + 1] = temp;

					tryAgain = true;
				}
			}
		}
		while(tryAgain);

		System.out.println("votre tableau est trié : " + Arrays.toString(tableau));			


	}

}
