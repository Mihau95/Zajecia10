import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProductTest {
    public static void main(String[] args) throws IOException {
        Product[] products = new Product[3];
        products[0] = new Product("Mleko", 2.3, "Laciate");
        products[1] = new Product("Woda", 2.0, "Staropolanka");
        products[2] = new Product("Chrupki", 3.5, "Flips");


            FileReader fileReader = new FileReader("Shopping.csv");
            BufferedReader bfr = new BufferedReader(fileReader);
            String line = null;
            while ((line = bfr.readLine()) !=null){
                System.out.println(line);
            }
            bfr.close();
    }
}
