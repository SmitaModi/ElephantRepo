import java.util.Scanner;
public class SmitaPart2 {
	//This class is designed to accept as input a number grade and
	//  calculate and return a letter grade using typical school system.
	//  In this part, the use of switch statement is demonstrated.
	//  Programmers prefer this over if-else because it results in cleaner,
	//  more readable code. Adding more cases in the future would be quicker.

	private static char getLetterGrade(float inputGrade){ 
	   	char letterGrade;
	   	int numberGrade = (int)inputGrade; //downcast the float to int
	   	int singleDigit = numberGrade/10;  //switch does not do > comparisons
	    	
	    switch (singleDigit) { 
            case 10: 
                letterGrade = 'A';	            	
                break; 
	        case 9: 
	            letterGrade = 'A';	            	
	            break; 
	        case 8: 
	            letterGrade = 'B';	            	
	            break; 
	        case 7: 
	            letterGrade = 'C';	            	
	            break; 
	        case 6: 
	            letterGrade = 'D';	            	
	            break; 
	        default: 
	            letterGrade = 'F';	            	
	            break; 
	    }
       	return(letterGrade);
	}

	public static void main(String[] args) {
	    // Create instance of Scanner class and read number from keyboard
	   	System.out.println("Enter your percentage: ");
	    Scanner myObj = new Scanner(System.in);
	    float input = myObj.nextFloat();

	    // Assign the returned value to variable to be printed to screen. 
	    char studentGrade = getLetterGrade(input);
	    System.out.println("Your Letter Grade is: " + studentGrade);
	        
	    // Close your instance of Scanner after use
	    myObj.close();
	}
}
