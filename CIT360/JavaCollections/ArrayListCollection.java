import java.util.*;

/* Array List example
@TylerTucker */

public class Main {

	public static void main(String args[]) {
   
	// Create array list
		ArrayList<String> myList = new ArrayList<String>();

	// Add elements to a list
		myList.add("NBA");
	  	myList.add("NFL");
	  	myList.add("MLB");
	  	myList.add("NHL");

	// Print the sports array
	  	System.out.println("Sports array:"+myList);

	// Add elements to a specific index
	  	myList.add(0, "WNBA");
	  	myList.add(1, "WNFL");

      	System.out.println("Sports array:"+myList);

	// Remove specific elements by name
	  	myList.remove("NBA");
	  	myList.remove("NFL");

	  	System.out.println("Sports array:"+myList);

    // Remove specific elements by index
	  	myList.remove(1);

	  	System.out.println("Sports array:"+myList);
   }
}