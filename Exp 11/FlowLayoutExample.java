import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("FlowLayout Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Set FlowLayout: Left Aligned, hgap: 10, vgap: 20
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Create Checkboxes
        JCheckBox cb1 = new JCheckBox("Java");
        JCheckBox cb2 = new JCheckBox("Python");
        JCheckBox cb3 = new JCheckBox("C++"); // Assuming C* meant C++

        // Add components to frame
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);

        // Display the window
        frame.setVisible(true);
    }
}