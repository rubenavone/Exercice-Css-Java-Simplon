package palindrome;

import java.util.Scanner;

public class Palindrome {
	    
	public static void main(String[] args) {
		//TODO 
		/*demandez la saisie d'un mot
		 *Déterminez si ce mot est un palindrome
		 *Transfomer le mot en upper ou lower cases peut importe. 
		 *Transformer la variable mot en tableau de char.
		 *inverser le tableau et le contenir dans une autre variable. 
		 *Verifier si mot et mot a l'envers sont égale.
		 *si oui alors le mot et un palindrome.
		 *Autrement le mot n'est pas un palindrome.
		 *
		 */
		Scanner sc = new Scanner(System.in);
		
		String mot = sc.nextLine().toLowerCase();
		
		System.out.println(mot);
		
		String reverse = new StringBuffer(mot).reverse().toString();
	      
	    System.out.println("la chaine de charactere a l'envers vaut " + reverse);
	    
	    if(mot.equals(reverse)){ /* il est egalement possible d'utiliser equalsIgnoreCase(reverse)
	     						  *	pour ne pas prendre la casse en compte
	    						  */
	    	System.out.println("c'est un palindrome");
	    }else{
	    	System.out.println("Ce n'est pas un palindrome");
	    }
	        
	    sc.close();
	    

		
	}
	
	   

}
