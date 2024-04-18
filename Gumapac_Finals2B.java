import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Gumapac_Finals2B {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        
        System.out.println("*****Base-Exponent Calculator*****");

        System.out.print("\nEnter Base: ");
        int base = Integer.parseInt(buffer.readLine());
        System.out.print("Enter Exponent: ");
        int exponent = Integer.parseInt(buffer.readLine());

        int product = 1;
        do {
            product *= base;
            exponent--;
        } while (exponent > 0);

        System.out.println("\nAnswer: " + product);
    }
}
