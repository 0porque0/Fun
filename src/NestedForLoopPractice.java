import java.util.Scanner;

public class NestedForLoopPractice {
    public static void main(String[] args) {
        print10x10Grid();
        printCustomGrid();
        nestedMathTable();
    }

    public static void print10x10Grid() {
        for (int outerIndex = 0; outerIndex < 10; outerIndex++) {
            for (int innerIndex = 0; innerIndex < 10; innerIndex++) {
                System.out.printf("outerIndex: %d -- innerIndex: %d\n", outerIndex, innerIndex);
            }
        }
    }

    public static void printCustomGrid() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nEnter a coulmn size: ");
        int columnSize = keyboard.nextInt(); // ask user for column number

        System.out.println("\nEnter a row size: ");
        int rowSize = keyboard.nextInt(); // ask user for row number

       for (int column = 0; column < columnSize; column++) {
        for (int row = 0; row < rowSize; row++){
            System.out.printf("coulmnSize: %d -- rowSize: %d\n", columnSize, rowSize); 
        }
       }
    }

    public static void nestedMathTable() {
        for (int outer = 0; outer < 10; outer++) {
            for (int inner = 0; inner < 10; inner++){
                System.out.printf("\nouter: %d  +  inner: %d = "+ (outer+inner), outer, inner );
            }
        }
    }
}
