import java.util.Scanner;

public class REYES_Midterm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float percentClassParticipation = 0.2f;
        float percentEnablingAssessment = 0.5f;
        float percentSummativeExam = 0.3f;

        System.out.print("\nClass Participation: ");
        int classParticipation = scanner.nextInt();
        float finalClassParticipation = classParticipation * percentClassParticipation;
        System.out.print("20% = " + String.format("%.2f", finalClassParticipation));

        System.out.print("\nEnabling Assessment: ");
        int enablingAssessment = scanner.nextInt();
        float finalEnablingAssessment = enablingAssessment * percentEnablingAssessment;
        System.out.print("50% = " + String.format("%.2f", finalEnablingAssessment));

        System.out.print("\nSummative Exam: ");
        int summativeExam = scanner.nextInt();
        float finalSummativeExam = summativeExam * percentSummativeExam;
        System.out.print("30% = " + String.format("%.2f", finalSummativeExam));

        System.out.println("\n===========================================");
        float finalGrade = finalClassParticipation + finalEnablingAssessment + finalSummativeExam;
        System.out.println("GRADE = " + String.format("%.2f", finalGrade));
    }
}
