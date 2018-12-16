package randArray;

public class RandArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Déclarez une variable de type tableau de 5 entiers.
		Remplissez ce tableau avec des valeurs aléatoires comprises entre 0 et 10.
		Indiquez si la valeur 4 est dans le tableau, si oui indiquez sa position.*/
		
		int[] tableau = new int[5];
		
		for(int i =0; i < tableau.length; i++) {
			tableau[i] = (int) (Math.random() * 11); //Approfondir la notion de caste ??????
			System.out.println(tableau[i]);
		}
	}

}
