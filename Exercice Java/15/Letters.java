package letters;

import java.util.Scanner;



public class Letters {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*Exercice 15
		Demandez la saisie d'un mot à l'utilisateur
		Afficher les trois derniers caractères de ce mot
		Afficher ce mot sans les deux premier caractère et sans les trois dernier caractères
		(NB : Gérez le cas où le mot n'est assez long )*/

		Scanner sc = new Scanner(System.in);

		boolean erreur = true;

		while(erreur) { // Boucle en cas de saisis inférieur a 6


			System.out.println("Merci de saisir un mot (minimum 6 lettres)");

			String input = sc.nextLine()  ;


			if(input.length() < 6) {
				System.out.println("Désoler le mot est trop court");
			}else {
				System.out.println("J'affiche les trois derniere lettre de votre mot");
				System.out.println(input.substring(input.length() - 3) ); //Le texte affiche les trois derniere lettre 		
				
				System.out.println("J'affiche Désormais votre mot avec les deux premiere lettre en moin \n"
						+ "et les trois derniere en moins également");
				System.out.println( input.substring(2 , input.length() - 3));
				// Demare a la deuxieme lettre pour ensuite terminer 
				// a la taille de la chaine - 3 ...
				erreur = false; //La booléen passe a false ainsi la boucle s'arrete 
			}

		}



		sc.close();
	}

}
