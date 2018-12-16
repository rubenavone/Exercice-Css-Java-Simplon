
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Exercice10
		Déclarez et initialisez une variable tab1 de type tableau contenant les 4 éléments suivants : 4, 67, 25, 87.
		Déclarez et initialisez une variable tab2 de type tableau contenant les 4 éléments suivants : 4.5, 67, 25.50, 87.00
		Déclarez et initialisez une variable tab3 de type tableau contenant les 4 éléments suivant : 'r', '2', '?' , '+'.
		Déclarez et initialisez une variable tab4 de type tableau contenant les 4 éléments suivant : "Robert",
		"Noemie", "David" , "Bertrand".
		Affichez le premier élément de tab1
		Remplacez la valeur de tab1 qui vaut 25 par la valeur 42.
		Afficher via une boucle for , toutes les valeurs de tab3.
		Affichez la taille de tab1		*/
		
		int array[] = {4, 67, 25, 87}; 
		double array2[] = {4.5, 67, 25.50, 87.00};
		char array3[] = {'r', '2', '?' , '+'};
		String array4[] = {"Robert", "Noemie", "David" , "Bertrand" };
		
		System.out.println("le premier element du tableau est " + array[0]);
		
		System.out.println("Nous allons changer la valeur de 25 situé dans le tableau 1");
		
		System.out.println("le premier element du tableau est " + array[2]);
		
		Array.set(array[2] = 23);
		
		System.out.println("le premier element du tableau est " + array[2]);
		
		System.out.println("la taille du tableau est " + array.length);
		
		System.out.println("la taille du tableau est " + array4.length);
		
		System.out.println("la taille du tableau est " + array2.length);
		
		System.out.println("nous allons afficher le tableau numero 3");
		for ( int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		

	}

	private static void set(int i) {
		// TODO Auto-generated method stub
		
	}



}
