import java.util.Scanner;

public class Reyes_Finals2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponent;
        int answer = 1;
        
        System.out.println("=====EXPONENT CALCULATOR=====");
        System.out.print("Enter Base: ");
        base = scanner.nextInt();
        System.out.print("Enter Exponent: ");
        exponent = scanner.nextInt();

        while(exponent > 0) {
            answer *= base;
            exponent--;
        }

        System.out.println("Answer: " + answer);
    }
}
