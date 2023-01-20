import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class ReadingACsvFile {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/dominicrios/Downloads/trees.csv")); //enter new file
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.println(scanner.next() + "\n");
        }
        scanner.close();
    }
}
