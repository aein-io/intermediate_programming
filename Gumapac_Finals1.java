import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Gumapac_Finals1 {
    public static void main(String[] args){
        int midtermGrade, finalGrade, averageGrade;
        String output;
        JDialog.setDefaultLookAndFeelDecorated(true);

        midtermGrade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Midterm Grade:"));
        finalGrade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Final Grade:"));
        averageGrade = (midtermGrade + finalGrade) / 2;

        output = "Average: " + averageGrade + "\n";

        if (averageGrade > 90 && averageGrade <= 100) {
            output += "Remarks: Excellent!";
        } else if (averageGrade > 80 && averageGrade <= 90) {
            output += "Remarks: Very Good!";
        } else if (averageGrade > 70 && averageGrade <= 80) {
            output += "Remarks: Good!";
        } else if (averageGrade > 60 && averageGrade <= 70) {
            output += "Remarks: Fair";
        } else {
            output += "Remarks: Below Poor";
        }

        JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.INFORMATION_MESSAGE);
    }   
}
