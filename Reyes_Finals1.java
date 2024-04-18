import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Reyes_Finals1 {
    public static void main(String[] args) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        int midtermGrade, finalGrade, averageGrade;
        
        System.out.println("=========AVERAGE CALCULATOR=========");
        System.out.print("Enter Midterm Grade: ");
        midtermGrade = Integer.parseInt(buffer.readLine());
        System.out.print("Enter Final Grade: ");
        finalGrade = Integer.parseInt(buffer.readLine());

        averageGrade = (midtermGrade + finalGrade) / 2;

        System.out.println("\nAverage: " + averageGrade);

        if(averageGrade > 90 && averageGrade < 101){
            System.out.println("Remarks: Excellent!");
        } else if(averageGrade > 80 && averageGrade < 91){
            System.out.println("Remarks: Very Good!");
        } else if(averageGrade > 70 && averageGrade < 81){
            System.out.println("Remarks: Good!");
        } else if(averageGrade > 60 && averageGrade < 71) {
            System.out.println("Remarks: Fair");
        } else {
            System.out.println("Remarks: Below Poor");
        }
    }
}