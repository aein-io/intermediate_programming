import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Reyes_SQ1 {
    public static void main(String[] args) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        int num;

        System.out.println("========EVEN OR ODD?========");
        System.out.print("Enter a number: ");
        num = Integer.parseInt(buffer.readLine());

        if (num % 2 == 0) {
            System.out.println("Your number is EVEN");
        } else {
            System.out.println("Your number is ODD");
        }
    }
}
