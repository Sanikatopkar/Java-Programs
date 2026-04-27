import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextAnalyzer extends JFrame {
    private JTextArea textArea;
    private JLabel statsLabel;

    public TextAnalyzer() {
        // Window Setup
        setTitle("Real-time Word Counter");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Text Area with Scrolling
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Stats Label
        statsLabel = new JLabel(" Words: 0 | Characters: 0", SwingConstants.LEFT);
        statsLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        statsLabel.setPreferredSize(new Dimension(500, 30));
        add(statsLabel, BorderLayout.SOUTH);

        // Adding KeyListener to the JTextArea
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Not needed for this logic
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not needed for this logic
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Trigger calculation after the key is released
                updateCounts();
            }
        });
    }

    private void updateCounts() {
        String text = textArea.getText();
        
        // Character count (including spaces)
        int charCount = text.length();

        // Word count logic
        // trim() removes leading/trailing spaces
        // split("\\s+") splits by one or more whitespace characters
        String[] words = text.trim().split("\\s+");
        int wordCount = (text.trim().isEmpty()) ? 0 : words.length;

        // Update the label
        statsLabel.setText(" Words: " + wordCount + " | Characters: " + charCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TextAnalyzer().setVisible(true);
        });
    }
}