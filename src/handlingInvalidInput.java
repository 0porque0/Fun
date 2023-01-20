import java.util.InputMismatchException;
import java.util.Scanner;

public class handlingInvalidInput {
    public static void main(String[] args) {
        handleBadInput();
        handleDivideBy0();
    }

    static void handleBadInput() {
        int amountOfMoney;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
        amountOfMoney = keyboard.nextInt();
       } catch (InputMismatchException e) {
        amountOfMoney = 0;
       }
       System.out.println("Amount of money = " + amountOfMoney);
    }

    static void handleDivideBy0() {
        int currentAmount = 100;
        System.out.println("\nCurrent amount is: " + currentAmount);
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number to store in divisor: ");
            int divisor = input.nextInt();
            System.out.println(currentAmount/divisor);
        } catch (ArithmeticException e) {
        System.out.println("You can't divide by 0 bro...");
        }
    }
}
