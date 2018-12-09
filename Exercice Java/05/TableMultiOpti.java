
import java.util.Scanner;

public class TableMultiOpti {

		public static void main(String[] arg){
		/*
		 * Réaliser une serie de table de multiplication 3 de 1 à 10
		 * Permettre a l'utilisateur de saisir le nombre qu'il souhaite *
		 */
			
		Scanner scan = new Scanner(System.in); //Init de la saisie 
			
		System.out.println("Quel nombre veut tu multiplier"); // affichage de la demande de nombre
			
		int MultipleNb = scan.nextInt(); // declaration de la variable = a la demande de la saisis
			
		for(int i = 1; i <= 10; i++){ //Pour i = 1 ; i inferieur ou égale a 10; incrementation de i 
			System.out.println(MultipleNb * i);		
		}

		scan.close();// permet de fermer la demande de saisis
	}
}

