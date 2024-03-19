import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Reyes_Midterm7A {
    public static void main(String[] args) {
        JDialog.setDefaultLookAndFeelDecorated(true);

        System.out.print("\nClass Participation: ");
        String userInput = JOptionPane.showInputDialog(null, "Enter a three-digit number: ");

        JOptionPane.showMessageDialog(null, "Your number is " + userInput + "\nFirst digit = " + userInput.charAt(0)
                + "\nLast digit = " + userInput.charAt(2));
    }
}
