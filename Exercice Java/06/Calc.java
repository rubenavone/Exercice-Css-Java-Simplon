package Calc;

import java.util.Scanner;

public class Calc {
	/*
	 * Il faut que l'utilisateur , entre deux nombre 
	 * une fois les deux nombre saisis, il faut que l'utilisateur 
	 * entre ensuite un opérateur (+ - / %)
	 */
	public static void main(String[] arg){
		
		//si la saisis des nombre est inferieur a - 1000 ou superieur a 1000 alors
		//le programme refuse et recommence la demande de saisis
		//Tant que la saisis est diferente des opérateur cité ci dessus alors recommence 
		//Si l'operateur est correcte alors il faut que l'opération s'effectue
		//Ducoup le soucis ce trouve au niveau de la gestion de saisis
		
		//Déclaration des booléen pour les while (loop)
		
		boolean wrongInputNumber = true;
		boolean continueOrNot = true; 
		
		while(continueOrNot) {
			
		Scanner scan = new Scanner(System.in);
		
		int firstNumber = 0;
		int secondNumber = 0;		
		String operator;
		String yesOrNo;
		
		System.out.println("Bonjour et bievenue dans notre calculatrice !");
		System.out.println("Merci de saisir les nombre a calculer! ");
		
		firstNumber = scan.nextInt();
		secondNumber = scan.nextInt();
		
			while (wrongInputNumber) {
						
				if (firstNumber < -1000 || secondNumber < -1000 || firstNumber > 1000  || secondNumber > 1000) {
					System.out.println("Une erreur c'est produite recommencer !");
					
				}else {
					System.out.println("bravo votre saisis est correcte !");
					
					wrongInputNumber = false;
					//System.out.println(wrongInputNumber); //debuging purpose 
				}
			} //Loop wrongInputNumber END
			
			
				System.out.println("merci de saisir l'opérateur que vous souhaitez utiliser (+, -, *, /)");
				
				scan.nextLine(); //Cette ligne est primordial elle permet de passer d'un input int a un input string
				
				operator = scan.nextLine();
				
				//Switch permettant de choisir la reponse adequate selon l'opérateur choisis
				switch (operator) {
				case  "+" : 
					System.out.println(firstNumber + " additioner a  " + secondNumber + " est égale à : " + (firstNumber + secondNumber));
					break;
				case  "-" : 
					System.out.println(firstNumber + " soustrait a " + secondNumber + " est égale à : " + (firstNumber - secondNumber));
					break;
				case  "*" : 
					System.out.println(firstNumber + " multiplier par " + secondNumber + "est égale à : " + firstNumber * secondNumber);
					break;
				case  "/" : 				
					if (firstNumber != 0 || secondNumber != 0){
						System.out.println(firstNumber + " diviser par " + secondNumber + " est égale à : " + firstNumber / secondNumber);
					}else {
						System.out.println("désoler vous ne pouvez pas faire un divison par zero");
					}
					break;
					default: 
						System.out.println("désoler saisis incorecte DUCOUP J4ADDITION3");
						System.out.println(firstNumber + secondNumber);
				}
				
					
			System.out.println("voulez vous faire une nouvelle opération ?");
			
			//Petit plus qui permet a l'utilisateur de recommencer sans que le programme ne ce stop
			yesOrNo = scan.nextLine();
			
			switch (yesOrNo) {
			case "y":
				continueOrNot = true;
				break;
			case "n":
				System.out.println("Merci d'avoir utiliser la calculatrice Calc12000");
				continueOrNot = false;
				break;
				default:
					System.out.println("Erreur de saisis le programme va s'arreter !");
			}
			
			scan.close();
					
		} //Loop continueOrNot End
	}
}