import java.util.Scanner;

public class CalculatorProject {
    public static void main(String[] args) {
        
        System.out.println("Enter a number ");
        // first user input number
        Scanner num = new Scanner(System.in);
        double num1 = num.nextDouble();

        System.out.println("Enter a second number ");
        // second user input number
        double num2 = num.nextDouble();

        System.out.println("Enter an operator ( +, -, /, * )");
        // user picks operator
        double result;
        Scanner keyboard = new Scanner(System.in);
        char userOperator = keyboard.next().charAt(0);
        
        switch (userOperator) {
            case '+': 
            System.out.println(num1 + num2);
            break;

            case '-':
            System.out.println(num1 - num2);
            break;

            case '*':
            System.out.println(num1 * num2);
            break;

            case '/':
            System.out.println(num1 / num2);
            break;

            default: 
            System.out.println("Incorrect operand");
            break;
         }
         
        

    }
}
