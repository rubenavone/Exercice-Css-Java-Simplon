package inp;

import java.util.Scanner; // importing the class scanner

public class Input {
	
	 public static void main(String[] arg){
	    	
		    System.out.println("please insert your name !"); // ask user for is name 
		    
		    Scanner scan = new Scanner(System.in); // this call the class scan in your soft
		    
		    String inputName = scan.nextLine(); // create the inputName var = to the input of user
		    
		    System.out.println( "Hello" + " " + inputName); // printing the result 
		    
		    scan.close();
		   
	}

}
