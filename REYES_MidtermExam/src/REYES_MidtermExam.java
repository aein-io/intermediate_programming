import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class REYES_MidtermExam {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        
        int wholeNum, num1, num2, num3, sum;

        System.out.println("========================================");
        System.out.println("Aeinnor A. Reyes");
        System.out.println("Midterm Exam");

        System.out.print("Enter a 3-digit integer: ");
        wholeNum = Integer.parseInt(buffer.readLine());

        num1 = wholeNum % 10;
        wholeNum /= 10;
        num2 = wholeNum % 10;
        num3 = wholeNum / 10;

        sum = num1 + num2 + num3;

        System.out.println("The sum of the digits = " + sum);
        System.out.println("========================================");
    }
}
