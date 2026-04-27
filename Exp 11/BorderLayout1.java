import java.awt.*;
import javax.swing.*;

public class BorderLayout1 {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Border Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set the layout to BorderLayout
        frame.setLayout(new BorderLayout());

        // NORTH: Input Area
        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("Enter the number: "));
        northPanel.add(new JTextField(10));
        frame.add(northPanel, BorderLayout.NORTH);

        // SOUTH: Result Area
        frame.add(new JButton("Result"), BorderLayout.SOUTH);

        // EAST: Octal Button
        frame.add(new JButton("Octal"), BorderLayout.EAST);

        // WEST: Binary Button
        frame.add(new JButton("Binary"), BorderLayout.WEST);

        // CENTER: Empty space or main display
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}