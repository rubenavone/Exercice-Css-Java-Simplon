package Multi;

import java.util.Scanner;

public class Multi {
	public static void main(String[] arg){
	/*
	 * Réaliser une serie de table de multiplication 3 de 1 à 10
	 * Permettre a l'utilisateur de saisir le nombre qu'il souhaite *
	 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("quel nombre veut tu multiplier");
		
		int MultipleNb = scan.nextInt();
		
	for(int i = 1; i < 11; i++) {
		System.out.println(MultipleNb * i);
	}
	
}
}
