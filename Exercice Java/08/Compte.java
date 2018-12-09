import java.util.Scanner;

public class Compte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calculer le nombre de jeunes.
 			Il s’agit de dénombrer toutes les personnes d'âge inférieur strictement à vingt ans
 			parmi un échantillon donné de vingt personnes. Les personnes saisissent leur âge sur
 			le clavier.
		 */
		//Mise en place d'une boucle pour récuperer tous les age des participant 
		//Utilisation d'un tableau eventuellement 
		//une fois les demande effectuer il faut faire un comparateur pour ranger les personne par age 
		//si ( personne > 20 )
		// alors jeune
		//sinon erreur vous n'etes pas dans la bonne tranche d'age 


		System.out.println("Bonjour et bienvenue ! \n" );
		//Variable

		int age; //variable de transition qui contien l'age
		int jeune = 0;//stockage des moin de 20
		int anomalie = 0;//Stockage des anomalie 

		Scanner sc = new Scanner(System.in); // init dela methode de scan

		for(int i = 1 ; i <= 20; i++) { //init de la boucle for (20 personne a rentré)

			System.out.println("Merci d'entrez votre age \n");

			age = sc.nextInt();

			System.out.println("vous etes le numero " + i + "\n");

			if (age <=20) { //si inferieur a 20 alors :
				System.out.println("Vous faite partie de la tranche d'age des jeunes \n");
				jeune++;
			}else { //sinon 
				System.out.println("Vous etes hors du temp dr who ? \n");
				anomalie++;
			}
		}

		//gestion de l'affichage du resultat

		System.out.println("il ya actuellement " + jeune + " jeunes\n");
		System.out.println("il ya actuellement " + anomalie + " anomalie\n");

		sc.close();

	}


}


