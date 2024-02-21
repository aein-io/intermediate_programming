import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Reyes_Midterm6B {
    public static void main(String[] args) {
        float percentClassParticipation = 0.2f;
        float percentEnablingAssessment = 0.5f;
        float percentSummativeExam = 0.3f;

        JDialog.setDefaultLookAndFeelDecorated(true);

        System.out.print("\nClass Participation: ");
        int classParticipation = Integer.parseInt(JOptionPane.showInputDialog(null, "Class Participation Score: "));
        float finalClassParticipation = classParticipation * percentClassParticipation;
        System.out.print("20% = " + String.format("%.2f", finalClassParticipation));

        System.out.print("\nEnabling Assessment: ");
        int enablingAssessment = Integer.parseInt(JOptionPane.showInputDialog(null, "Enabling Assessment Score: "));
        float finalEnablingAssessment = enablingAssessment * percentEnablingAssessment;
        System.out.print("50% = " + String.format("%.2f", finalEnablingAssessment));

        System.out.print("\nSummative Exam: ");
        int summativeExam = Integer.parseInt(JOptionPane.showInputDialog(null, "Summative Exam Score: "));
        float finalSummativeExam = summativeExam * percentSummativeExam;
        System.out.print("30% = " + String.format("%.2f", finalSummativeExam));

        System.out.println("\n===========================================");
        float finalGrade = finalClassParticipation + finalEnablingAssessment + finalSummativeExam;
        System.out.println("GRADE = " + String.format("%.2f", finalGrade));

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setText("20% Class Participation = " + String.format("%.2f", finalClassParticipation) + "\n" +
        "50% Enabling = " + String.format("%.2f", finalEnablingAssessment) + "\n" +
        "20% Summative = " + String.format("%.2f", finalSummativeExam) + "\n" +
        "============================== " + "\n" + "\n" +
        "\n" + "GRADE = " + String.format("%.2f", finalGrade));

        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(null, scrollPane);
    }
}
