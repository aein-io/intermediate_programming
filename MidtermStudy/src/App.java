import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class App {

    public static void main(String[] args){
        String message;

        JDialog.setDefaultLookAndFeelDecorated(true);

        JTextArea textArea = new JTextArea(8, 30);
        
        message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut quis augue erat. Donec pellentesque non diam posuere efficitur. Fusce vitae nisi placerat felis vulputate posuere. Proin laoreet dapibus nunc, a interdum odio pharetra sed. Proin facilisis, ante sit amet lobortis ullamcorper, mauris velit lacinia turpis, vitae placerat est eros ac dolor. Nam cursus pellentesque maximus. Sed volutpat posuere dolor, et elementum odio tempor vitae. Integer volutpat ex id augue maximus sollicitudin. Aliquam efficitur, eros ac sollicitudin cursus, lectus augue imperdiet lorem, a placerat neque ex ullamcorper sapien. Nam volutpat nisi eget bibendum maximus. Vestibulum auctor urna vitae tortor efficitur, ut tincidunt nunc hendrerit.\n" + //
                "\n" + //
                "Mauris accumsan ligula nec ex luctus venenatis quis sed urna. Etiam pretium commodo consequat. Mauris eget cursus diam. Maecenas eget accumsan justo. Maecenas et tempor lectus, in pulvinar dolor. Sed condimentum nisi est, non rutrum metus dapibus id. Donec ut viverra dui. Praesent faucibus, ante tempor hendrerit efficitur, lorem nunc maximus turpis, a fringilla turpis sapien id risus. Phasellus eget aliquam est. Nam tempus viverra pulvinar. Nullam dictum porta euismod.\n" + //
                "\n" + //
                "Quisque id lacinia lectus. In hac habitasse platea dictumst. Maecenas feugiat tempus sem et euismod. Etiam eget blandit eros. Phasellus ut volutpat magna. Praesent et ullamcorper diam. Praesent sit amet nisl massa. Vestibulum ornare orci odio, sit amet tincidunt purus aliquam id. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Curabitur lobortis nisl a lectus lacinia, in efficitur odio sodales. Nullam convallis ullamcorper urna. In in pharetra enim, quis suscipit eros. Donec nec cursus justo. Nulla vulputate leo ut libero elementum, id pellentesque nisl mattis.\n" + //
                "\n" + //
                "Duis venenatis libero dapibus lacus tincidunt sodales. Praesent congue eros non imperdiet ultricies. Donec in lorem facilisis, porta nunc non, volutpat magna. Ut at purus malesuada, accumsan arcu a, varius felis. Nulla ligula libero, bibendum nec elit vel, consectetur condimentum nibh. Suspendisse sodales euismod risus. Aliquam sit amet orci in ante rhoncus scelerisque ac vitae ex. Donec vulputate pharetra lacus, eget sagittis velit fringilla vel. Nunc venenatis lorem et faucibus vulputate. Duis sit amet tristique libero. Integer tincidunt egestas tristique. Aliquam hendrerit mi eu molestie convallis. Donec pharetra arcu leo, nec semper magna pellentesque eu. Vivamus pulvinar tortor nec velit pretium convallis quis at nisi.\n" + //
                "\n" + //
                "In bibendum magna nec tortor fermentum tincidunt. Nam lectus erat, ornare nec justo vel, laoreet porta felis. Quisque luctus, nisl eget iaculis viverra, purus mi tincidunt elit, vel placerat lacus magna a urna. In at velit et magna fermentum hendrerit non sed nisi. Phasellus ac augue sem. Nam vulputate diam tristique quam pellentesque commodo. Suspendisse interdum tempus malesuada. Suspendisse potenti. Sed tempor mattis libero quis pretium. Donec ultrices non nisi efficitur molestie. Mauris accumsan vestibulum vulputate.";
        
        textArea.setText(message);
        
        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(null, scrollPane);
    }
}