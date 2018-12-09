
import java.util.Scanner;

public class Nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*Ecrire un programme qui calcule les N premiers multiples d'un nombre entier X.
		 N et X étant entrés au clavier.
		 Il est demandé de choisir la structure répétitive (for, while, do...while) la mieux
		 appropriée au problème.
		 On ne demande pas pour le moment de gérer les débordements (overflows) dus à des
		 demandes de calcul dépassant la capacité de la machine.
			 * 
			 * ****************************************************   Cherchez l'erreur ...
			 */
		
		//////////////////
		//////var////////
		////////////////
		
		int nombreUn;
		int nombreDeux;
				
		//////////////////
		//////END////////
		////////////////
				
		Scanner sc = new Scanner(System.in); // init pour poouvoir saisir les nombres 
		
		System.out.println("Bonjour bienvenu.e sur ce petit programme \n vous allez faire votre calcul");
		
		System.out.println("Merci de saisir le nombre a multiplier");
		
		nombreUn = sc.nextInt();
		
		System.out.println("Merci de saisir le nombre de fois la taille de table");
		
		nombreDeux = sc.nextInt();
		
		System.out.println("Vous avez choisis " + nombreUn + " et " + nombreDeux );
		
		for(int i = 1; i <= nombreDeux; i--) {
			
			//System.out.println(i);
			
			System.out.println(i * nombreUn);
			
			sc.close();
		}
		
	}

}
