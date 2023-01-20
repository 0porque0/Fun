import java.util.Scanner;

class GuessTheNumber{
    public static void main(String[] args) {
        guessingGame();
    }
    
    static void guessingGame() {
        System.out.println("The goal is to guess the number in as few tries as possible.");
        
        int secretNumber;
        secretNumber = (int)(Math.random()*101); 
        int userGuess;
        int guesses = 0;    
        do {
            System.out.println("\nGuess a number 1 - 100");
            Scanner keyboard = new Scanner(System.in);
            userGuess = keyboard.nextInt();
            guesses++;

            if (userGuess == secretNumber){
                System.out.println("You guessed correctly");
                break;
             } if (userGuess > secretNumber){
                 System.out.println("The secret number is lower than userGuess");
             } if (userGuess < secretNumber){
                 System.out.println("The secret number is higher than userGuess");
             } 
        } 
        while(userGuess != secretNumber); {
            if (userGuess == secretNumber){
            System.out.println("It took " + guesses + " guesses to figure out the secret number");
            }
        }
    }
}