import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REYES_Midterm2 {
    public static void main(String[] args) {

        float percentClassParticipation = 0.2f;
        float percentEnablingAssessment = 0.5f;
        float percentSummativeExam = 0.3f;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("\nClass Participation: ");
            int classParticipation = Integer.parseInt(reader.readLine());
            float finalClassParticipation = classParticipation * percentClassParticipation;
            System.out.print("20% = " + String.format("%.2f", finalClassParticipation));

            System.out.print("\nEnabling Assessment: ");
            int enablingAssessment = Integer.parseInt(reader.readLine());
            float finalEnablingAssessment = enablingAssessment * percentEnablingAssessment;
            System.out.print("50% = " + String.format("%.2f", finalEnablingAssessment));

            System.out.print("\nSummative Exam: ");
            int summativeExam = Integer.parseInt(reader.readLine());
            float finalSummativeExam = summativeExam * percentSummativeExam;
            System.out.print("30% = " + String.format("%.2f", finalSummativeExam));

            System.out.println("\n===========================================");
            float finalGrade = finalClassParticipation + finalEnablingAssessment + finalSummativeExam;
            System.out.println("GRADE = " + String.format("%.2f", finalGrade));


        } catch (IOException e) {
            System.err.println("An I/O error occured");
        } catch (NumberFormatException e) {
            System.err.println("Input is not an integer");
        }
    }
}
