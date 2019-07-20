import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

          public static void main(String[] args) {
          /* String[] options = { "Rock", "Paper", "Scissors" }; */

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
           else if (userInput == 1 & n == 2) {
                   System.out.print("Computer wins!");
   }
           else if (userInput == 1 & n == 3) {
                   System.out.print("Player wins!");
   }
           else if (userInput == 2 & n == 1) {
                   System.out.print("Player wins!");
   }
           else if (userInput == 2 & n == 3) {
                   System.out.print("Computer wins!");
   }
           else if (userInput == 3 & n == 1) {
                   System.out.print("Computer wins!");
   }
           else if (userInput == 3 & n == 2) {
                   System.out.print("Player wins!");
   }
            else {
                    System.out.print("Error.");
   }
 }
}
