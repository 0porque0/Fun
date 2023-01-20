import java.util.Random; 
import java.util.Scanner; // import scanner class

public class NumberGuesser8 {
    public static void main(String[] args) {

      System.out.println("Welcome to number guesser!");
      Random rand = new Random(); 
      int randomNum = rand.nextInt(10);
      


        try (Scanner guesserInput = new Scanner(System.in)) {
            
            
            // Enter guess and press Enter
            System.out.println("Enter guess");
            int guess = guesserInput.nextInt(); 
            if (guess == randomNum) {
              System.out.println("You guessed correctly");
            }
            if (guess != randomNum) {
              System.out.println("Wrong");
            }

               
        }   
        System.out.println("random number is: " + randomNum); 
        
      }
      }
    
    

