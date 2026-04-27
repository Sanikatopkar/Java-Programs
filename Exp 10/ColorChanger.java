import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger extends JFrame {
    private JPanel mainPanel;

    public ColorChanger() {
        // Window Setup
        setTitle("Background Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Panel (The part that will change color)
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel, BorderLayout.CENTER);

        // Control Panel for Buttons
        JPanel buttonPanel = new JPanel();
        
        // Creating buttons
        JButton redBtn = new JButton("Red");
        JButton greenBtn = new JButton("Green");
        JButton blueBtn = new JButton("Blue");
        JButton resetBtn = new JButton("Reset");

        // Adding buttons to the panel
        buttonPanel.add(redBtn);
        buttonPanel.add(greenBtn);
        buttonPanel.add(blueBtn);
        buttonPanel.add(resetBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        // Adding ActionListeners to buttons
        redBtn.addActionListener(e -> mainPanel.setBackground(Color.RED));
        greenBtn.addActionListener(e -> mainPanel.setBackground(Color.GREEN));
        blueBtn.addActionListener(e -> mainPanel.setBackground(Color.BLUE));
        resetBtn.addActionListener(e -> mainPanel.setBackground(Color.WHITE));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorChanger().setVisible(true);
        });
    }
}