import java.util.Scanner;

public class SmitaPart1 {
	//This class is designed to accept as input a number grade and
	//  calculate and return a letter grade using typical school system.
	//  In this part, the if-else structure is used.

    private static char getLetterGrade(float numGrade){ 
        if (numGrade >= 90) {
        	return('A');
        } else if (numGrade >= 80){
        	return('B');
        } else if (numGrade >=70){
        	return('C');
        } else if (numGrade >=60){
        	return('D');
        } else {
        	return('F');
        }
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
