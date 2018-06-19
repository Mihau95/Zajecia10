package FileX;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Wpis.txt");

        try {
            Scanner scanner = new Scanner(file);
            if (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                System.out.println(nextLine);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("NIe ma takiego pliku!");
        }

        System.out.println("************************");
    }
}
