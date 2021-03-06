package rockpaperscissors;

/* RockPaperScissors Class:
 * Play rock paper scissors against an "ai"!
 * Generates random number for the AI for their choice.
 * Player selects a number 1-3 to represent their choice.
 * Uses IF-Statement to determine the winner.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner scanMe = new Scanner(System.in);

		System.out.println("Enter your choice! \n " + "1: Rock \n " + "2: Paper \n " + "3: Scissors \n");

		int userInput = scanMe.nextInt();
		   
/* Now for the AI part */

		Random rand = new Random();

		int aiOption = rand.nextInt(2);
           
		int n = aiOption + 1;

/* If-statement to see who wins */

		if(userInput == n) {
			System.out.print("Tie!");
			}
		else if (userInput == 1 & n == 2 | userInput == 2 & n == 3 | userInput == 3 & n == 1) {
			System.out.print("Computer wins!");
                   }
		else if (userInput == 1 & n == 3 | userInput == 2 & n == 1 | userInput == 3 & n == 2) {
			System.out.print("Player wins!");
                   }
		else {
			System.out.print("Error.");
			}
		System.out.println("\nPlayer selected: " + userInput);
		System.out.println("Computer selected: " + n);
 }
}