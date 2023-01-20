import java.time.LocalTime;
import java.util.Scanner;

public class VariablesPractice {


    public static void main(String[] args) {

        String name = "Dominic";
        char grade = 'A';

        System.out.printf("My name is %s and I want an %c on this project", name, grade);
        
        printSquare();
        printForce();
        printCurrentTime();
    
        }

    
        public static void printSquare() {
        Scanner num = new Scanner(System.in);
        System.out.println("\nEnter a number: ");

        int number = num.nextInt();
        System.out.println(number + " Squared =  " + (number * number) );
        }

        private static void printForce() {
            Scanner mass = new Scanner(System.in);
            System.out.println("\nEnter mass: ");
            double m = mass.nextDouble();

            Scanner acceleration = new Scanner(System.in);
            System.out.println("\nEnter acceleration: ");
            double a = acceleration.nextDouble();

            double f = (m * a);
            System.out.println("Force equals ≈ " + f + " newtons ");
        }

        private static void printCurrentTime() { 
            int currentHour, currentMinute, currentSecond;

            Scanner hour = new Scanner(System.in);
            System.out.println("\nHour? ");
            int h = hour.nextInt();

            Scanner minute = new Scanner(System.in);
            System.out.println("\nMinute? ") ;
            int m = minute.nextInt();

            Scanner second = new Scanner(System.in);
            System.out.println("\nSceond?");
            int s = second.nextInt();

            System.out.println("\nThe current time is " + h + ":" + m + ":" + s );



            
            

        }


}

