import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class REYES_MidtermExam2 {
    public static void main(String[] args) throws Exception {
        int wholeNum, num1, num2, num3, sum;
        String message;

        wholeNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Aeinnor A. Reyes\n Midterm Exam\n\n Enter a 3-digit integer:"));


        num1 = wholeNum % 10;
        wholeNum /= 10;
        num2 = wholeNum % 10;
        num3 = wholeNum / 10;

        sum = num1 + num2 + num3;

        message = "The sum of the digits = " + sum;

        JOptionPane.showMessageDialog(null, message);
    }
}
