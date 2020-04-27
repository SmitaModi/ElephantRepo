import java.util.Scanner;

public class IfElseChallenge {
    static void AnimalGame() {
        System.out.println("Dog or Cat?");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String userInpString = myObj.nextLine();          // Read user input
        String upperInp = userInpString.toUpperCase();    // Convert to uppercase.
         
        if (upperInp.equals("DOG")){
        	System.out.println("Woof-woof");
        } else if (upperInp.equals("CAT")) {
        	System.out.println("Meow!");
        } else {
        	System.out.println("Invalid entry: " + upperInp);
        }
        
        // Close your instance of Scanner after use
        myObj.close();
    }
   
    static void NumberGame() {
    	// Create an instance of getRandomInteger class
    	// Get a random integer between max and min
    	int rand_num = getRandomInteger(10,1);
    	
        // Create instance of Scanner class and read number from keyboard
    	System.out.println("Pick a number between 1 and 10");
        Scanner myObj = new Scanner(System.in);
        int userNum = myObj.nextInt();

        if (userNum == rand_num) {
        	System.out.println("That's amazing!");
        	} else if (userNum < 1) {
        	System.out.println("Too low. Invalid entry: " + userNum);
        } else if (userNum > 10) {
        	System.out.println("Too high. Invalid entry: " + userNum);
        } else {
        	System.out.println("");
        	System.out.println("Nope! Random number was: " + rand_num);
        }
        
        // Close your instance of Scanner after use
        myObj.close();
    }
    
    public static int getRandomInteger(int maximum, int minimum){ 
    	return ((int) (Math.random()*(maximum - minimum))) + minimum; 
    }

    static void GradeGame() {
        // Create instance of Scanner class and read number from keyboard
    	System.out.println("Enter your percentage: ");
        Scanner myObj = new Scanner(System.in);
        float userNum = myObj.nextFloat();

        if (userNum >= 60) {
        	System.out.println("You pass!");
        } else {
        	System.out.println("You must re-take the course.");
        }

        // Close your instance of Scanner after use
        myObj.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Games List:");
        System.out.println("    1) Dog or Cat");
        System.out.println("    2) Number Guess");
        System.out.println("    3) What's Your Grade?");
        System.out.println("    0) Exit\n");

        System.out.println("Enter Game choice");
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.next();
        
      	if (userChoice.equals("1")) {
   	        AnimalGame();
   	        System.out.println("Game over.");
        } else if (userChoice.equals("2")) {
            NumberGame();
            System.out.println("Game over.");
        } else if (userChoice.equals("3")) {
            GradeGame();
            System.out.println("Game over.");
        } else if (userChoice.equals("0")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice!");
        }
        
        // Close your instance of Scanner after use
        scan.close();
	}
}