import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Reyes_Midterm6A {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea(10, 30);

        textArea.setText("I look at her and have to smile\n" + //
                "As we go driving for a while\n" + //
                "Her hair blowing in the open window of my car\n" + //
                "And as we go, the traffic lights\n" + //
                "I watch them glimmer in her eyes\n" + //
                "In the darkness of the evening\n" + //
                "And I've got all that I need\n" + //
                "Right here in the passenger seat\n" + //
                "And I can't keep my eyes on the road\n" + //
                "Knowing that she's inches from me\n" + //
                "We stop to get something to drink\n" + //
                "My mind clouds and I can't think\n" + //
                "Scared to death to say I love her\n" + //
                "Then the moon peeks from the clouds\n" + //
                "I hear my heart, it beats so loud\n" + //
                "Try to tell her simply\n" + //
                "That I've got all that I need\n" + //
                "Right here in the passenger seat\n" + //
                "Oh, and I can't keep my eyes on the road\n" + //
                "Knowing that she's inches from me\n" + //
                "Oh, I've got all that I need\n" + //
                "Right here in the passenger seat\n" + //
                "Oh, and I can't keep my eyes on the road\n" + //
                "Knowing that she's inches from me\n" + //
                "Oh, and I know\n" + //
                "That this love will grow\n" + //
                "Oh, and I've got all that I need\n" + //
                "Right here in the passenger seat\n" + //
                "Oh, and I can't keep my eyes on the road\n" + //
                "Knowing that she's inches from me\n" + //
                "And I've got all that I need (I look at her and have to smile)\n" + //
                "Right here in the passenger seat (as we go driving for a while)\n" + //
                "(Her hair blowing in the open window of my car)\n" + //
                "Oh, and I can't keep my eyes on the road (and as we go, the traffic lights)\n" + //
                "Knowing that she's inches from me (I watch them glimmer in her eyes)\n" + //
                "(In the darkness of the evening)\n" + //
                "And I've got all that I need (I look at her and have to smile)\n" + //
                "Right here in the passenger seat (as we go driving for a while)\n" + //
                "(Her hair blowing in the open window of my car)\n" + //
                "Oh, and I can't keep my eyes on the road (and as we go, the traffic lights)\n" + //
                "Knowing that she's inches from me (I watch them glimmer in her eyes)\n" + //
                "(In the darkness of the evening)\n" + //
                "And I've got all that I need (I look at her and have to smile)\n" + //
                "Right here in the passenger seat (as we go driving for a while)\n" + //
                "");

        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(null, scrollPane, "Passenger's Seat", JOptionPane.INFORMATION_MESSAGE);
    }
}
