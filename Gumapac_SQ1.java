import java.util.Scanner;

public class Gumapac_SQ1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Even or Odd Determiner");
        System.out.print("\nEnter a number: ");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("\n" + input + " is an even number.");
        } else {
            System.out.println("\n" + input + " is an odd number.");
        }
    }
}
