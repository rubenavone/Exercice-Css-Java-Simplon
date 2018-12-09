package CompteOpti;

import java.util.Scanner;

public class CompteOpti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Il s’agit de dénombrer les personnes d'âge inférieur strictement à 20 ans, les
			 personnes d'âge supérieur strictement à 40 ans et celles dont l'âge est compris entre
			 20 ans et 40 ans (20 ans et 40 ans y compris).
			 Le comptage est arrêté dès la saisie d’un centenaire. Le centenaire est compté.
			 Donnez le programme java correspondant qui affiche les résultats.*/

		//Mise en place d'une boucle pour récuperer tous les age des participant 
		//Utilisation d'un tableau eventuellement // PAS DU TOUT EN FAITE
		//inrementatation d'une variable selon la saisis cela permet d'avoir l'age au bout du compte
		//une fois les demande effectuer il faut faire un comparateur pour ranger les personne par age 
		//si ( personne > 20 )
		// alors jeune
		//sinon si (persone < 20 et persone > 40)
		// alors age moyen
		//sinon si (persone < 40)
		//alors age vieux 
		//sinon erreur vous n'etes pas dans la bonne tranche d'age 


		System.out.println("Bonjour et bienvenue ! \n" );
		//Variable

		int age; //variable de transition qui contien l'age
		int jeune = 0;//stockage des moin de 20
		int moyen = 0;//stockage entre 20 et 40
		int vieux = 0;//stockage plus de 40
		int anomalie = 0;//Stockage des anomalie 
		int plusDeCent = 0;

		Scanner sc = new Scanner(System.in); // init dela methode de scan

		for(int i = 1 ; i <= 20; i++) { //init de la boucle for (20 personne a rentré)

			System.out.println("Merci d'entrez votre age \n");

			age = sc.nextInt();

			System.out.println("vous etes le numero " + i + "\n");

			if (age <20) { //si inferieur a 20 alors :
				System.out.println("Vous faite partie de la tranche d'age des jeunes \n");
				jeune++;
			}else if ((age >= 20) && (age < 40)){ //si supérieur a 20 et inferieur a 40 alors :
				System.out.println("vous faire partie de la tranche d'age moyenne \n");
				moyen++;
			}else if(( age >= 40) && (age < 100)){ //si supérieur a 40 et inferieur a 100 alors :
				System.out.println("La maturité comme vous avez de la chance \n");
				vieux++;
			}else if (age == 100) {
				i = 20;
				System.out.println("On a un gagnant ! 100 ben dit donc");
				plusDeCent++;
			}
			else { //sinon 
				System.out.println("Vous etes hors du temp dr who ? \n");
				anomalie++;
			}
		}

		//gestion de l'affichage du resultat

		System.out.println("il ya actuellement " + jeune + " jeunes\n");
		System.out.println("il ya actuellement " + moyen + " moyen\n");
		System.out.println("il ya actuellement " + vieux + " vieux\n");
		System.out.println("il ya actuellement " + anomalie + " anomalie\n");
		System.out.println("il ya actuellement " + plusDeCent+ " CENTENAIRE !\n");
		
		sc.close();
	}


}




