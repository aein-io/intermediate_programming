import java.util.Scanner;

public class Reyes_Finals2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponent;
        int answer = 1;
        
        System.out.println("=====EXPONENT CALCULATOR=====");
        System.out.print("Enter Base: ");
        base = scanner.nextInt();
        System.out.print("Enter Exponent: ");
        exponent = scanner.nextInt();

        for(int i = 1; i <= exponent; i++) {
            answer *= base;
        }

        System.out.println("Answer: " + answer);
    }
}
