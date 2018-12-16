package toUpper;

import java.util.Scanner;

public class ToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Exercice 14
			1.demander à un utilisateur de saisir une chaine de caractère
			2.retournez cette chaine en majuscule
			3.retournez cette chaine avec la première lettre en majuscule
			*/
		
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		
		System.out.println(input.toUpperCase());
		
		System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1)); 
	
		//La methode subtring permet de selectionner une partie de la chaine de caractere 
		//La methode toUpperCase permet de mettre les lettres en Capitale
		
		sc.close();
	}

	



}
