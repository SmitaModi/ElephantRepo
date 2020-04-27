import java.util.Scanner;

public class SmitaPart3 {
    //This class is designed to showcase the use of nested if-else statements.

	public static void main(String[] args) {
	  	System.out.println("I can guide you to the correct theatre! ");
	  	
	     // Create instance of Scanner class and read String from keyboard
	  	System.out.println("What movie are you going to see? ");
	  	Scanner myMovie = new Scanner(System.in);
	    String movieName = myMovie.nextLine();          // Read user input
	    
	     // Create another instance of Scanner class and read String from keyboard
        System.out.println("Showings:");
        System.out.println("   1) Morning");
        System.out.println("   2) Matinee");
        System.out.println("   3) Evening");
	  	Scanner myTime = new Scanner(System.in);
	    String movieTime = myTime.next();          // Read user input

		// Assign the Theatre Location and Door Number. 
	    String upperName = movieName.toUpperCase();
	    String theatreLoc;
	    int theatreDoor = 0;
	    
        if (upperName.equals("EXTRACTION")) {
        	theatreLoc = "ADDISON";
            if (movieTime.equals("1")) {
            	theatreDoor = 1;
            } else if (movieTime.equals("2")) {
            	theatreDoor = 5;
            } else {
            	theatreDoor = 10;
            }
        } else if (upperName.equals("BOURNE IDENTITY")) {
        	theatreLoc = "IRVING";
            if (movieTime.equals("1")) {
            	theatreDoor = 3;
            } else if (movieTime.equals("2")) {
            	theatreDoor = 2;
            } else {
            	theatreDoor = 5;
            }
        } else if (upperName.equals("SKYFALL")) {
        	theatreLoc = "CARROLLTON";
            if (movieTime.equals("1")) {
            	theatreDoor = 4;
            } else if (movieTime.equals("2")) {
            	theatreDoor = 1;
            } else {
            	theatreDoor = 3;
            }
        } else {
        	theatreLoc = "NO SUCH MOVIE";
        }
        
		System.out.println("Location: " + theatreLoc + "  Door " + theatreDoor);
		        
		// Close your instance of Scanner after use
		myMovie.close();
		myTime.close();
	}
}

