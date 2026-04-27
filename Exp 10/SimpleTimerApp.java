import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleTimerApp extends JFrame {
    private JLabel displayLabel;
    private JButton startButton, stopButton;
    private Timer backgroundTimer;
    private int counter = 0;

    public SimpleTimerApp() {
        // Window Setup
        setTitle("Background Event Timer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // UI Components
        displayLabel = new JLabel("Timer: 0", SwingConstants.CENTER);
        displayLabel.setFont(new Font("Arial", Font.BOLD, 30));
        
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        stopButton.setEnabled(false); // Disable stop until timer starts

        add(displayLabel);
        add(startButton);
        add(stopButton);

        // The Background Event (Timer)
        // Fires every 1000 milliseconds (1 second)
        backgroundTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                displayLabel.setText("Timer: " + counter);
            }
        });

        // Start Button Logic
        startButton.addActionListener(e -> {
            backgroundTimer.start();
            startButton.setEnabled(false);
            stopButton.setEnabled(true);
        });

        // Stop Button Logic
        stopButton.addActionListener(e -> {
            backgroundTimer.stop();
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleTimerApp().setVisible(true);
        });
    }
}