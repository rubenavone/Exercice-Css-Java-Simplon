package tableau2d;

public class Tableau2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Exercice20
		 *Déclarez et initialiser un tableau d'entiers à deux dimensions, dont la taille est deux
		 *pour la première dimension et
		 *deux aussi pour la seconde dimension. Choisissez les valeurs à mettre dans ce tableau .
		 *Ecrivez le programme java qui lit puis qui affiche ce tableau.
		 */
		
		int tableau1[][] = {{4 , 3},{3 , 4}};
		
		for(int i = 0 ; i < tableau1.length; i++) {
			
			for( int j = 0; j < tableau1[i].length; j++) {
				
				System.out.println(tableau1[i][j]);
				
			}
			
		}
		
	}

}
