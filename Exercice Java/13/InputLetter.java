package inputLetter;

import java.util.Scanner;

public class InputLetter {
	public static void main(String[] args) {
		/*1.demander à un utilisateur de saisir une chaine de caractère
		2.demander à cet utilisateur de saisir une lettre
		3.calculez le nombre de fois où cette lettre est présente dans la chaine saisie en 1.*/			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Merci d'inserer une phrases");
		
		String input =  sc.nextLine();	
		int count = 0;
		
		System.out.println(input);
		
		System.out.println("Merci de choisir la lettre a compter ");
		
		String inputLetter = sc.nextLine();
			
		System.out.println(inputLetter);
			
		for (int i = 0; i < input.length(); i++) {
			char convertInputLetter = inputLetter.charAt(0);
			char convertInput = input.charAt(i);
			if (convertInputLetter == convertInput) {
				count++;
			}else {
				
			}
		}
		System.out.println("il y a " + count + " fois la lettre " + inputLetter);
			
		
		
		sc.close();
	}
}
 