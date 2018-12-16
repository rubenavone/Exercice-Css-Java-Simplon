package palindrome;

import java.util.Scanner;

public class PalindromeV2 {
	public static void main(String[] args) {
		/*demandez la saisie d'un mot
		 *Déterminez si ce mot est un palindrome
		 *Transfomer le mot en upper ou lower cases peut importe. 
		 *Transformer la variable mot en tableau de char.
		 *inverser le tableau et le contenir dans une autre variable. 
		 *Verifier si mot et mot a l'envers sont égale.
		 *si oui alors le mot et un palindrome.
		 *Autrement le mot n'est pas un palindrome.
		 *L'idée c'est de verifier lettre a lettre si elle sont égale 
		 *ainsi pour mon nom
		 *index 0 == index.length -1
		 *index 1 == index.length -2 
		 *index 3 == index.length -3
		 */	
		Scanner sc = new Scanner(System.in);
		
		String mot = sc.nextLine();
		
		int compteur = 0;
		
		
		for (int i = 0; i < mot.length(); i++) {
			
			//System.out.println(mot.charAt(i));
			
			String lettre = mot.substring(i , i+1);
			
			String lettreOpose = mot.substring(mot.length() - (i+1) , mot.length() - (i));
						
			System.out.println(lettreOpose);
			
			if (lettre.charAt(0) == lettreOpose.charAt(0)) {
				System.out.println("blablablab");
				compteur ++;
			}else {
				System.out.println(lettre + " diferent de " + lettreOpose);
				
			}
			if (compteur == mot.length()) {
				System.out.println("c'est un palindrome");
			}else {
				System.out.println("ce n'est pas un palindrome");
			}
		}
		
		sc.close();
		
		
		/*System.out.println(mot.length()-1);
		System.out.println(mot.substring(mot.length() - 1));
		System.out.println(mot.substring(0 , 1));
		System.out.println(mot.substring(mot.length() - (0 +1)));*/
	}
}
