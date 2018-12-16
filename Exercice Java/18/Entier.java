package entier;

import java.util.Scanner;

public class Entier {
	public static void main(String[] args) {
		/*Exercice 18
		 *Demandez une saisie d'un entier entre 0 et 256 puis afficher 
		 *cet entier et sa conversion en char
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int nombreInput;
		
		System.out.println("Bonjour, merci de saisir un nombre entier entre 0 et 256");
		
		nombreInput = sc.nextInt();		
		
		char inputToChar = (char) nombreInput;
		
		System.out.println(inputToChar);
		
		System.out.println(Character.toChars(nombreInput));
		
		sc.close();
		
	}
}
