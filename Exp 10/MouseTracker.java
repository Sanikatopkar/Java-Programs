import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseTracker extends JFrame {
    private JLabel coordsLabel;

    public MouseTracker() {
        // Basic Window Setup
        setTitle("Mouse Coordinate Tracker");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Label to display coordinates
        coordsLabel = new JLabel("Move the mouse to see coordinates", SwingConstants.CENTER);
        coordsLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(coordsLabel, BorderLayout.SOUTH);

        // Custom Panel to capture mouse movement
        TrackerPanel panel = new TrackerPanel();
        add(panel, BorderLayout.CENTER);

        // Adding the Motion Listener to the panel
        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Update the label text with current X and Y
                coordsLabel.setText("Coordinates: X=" + e.getX() + ", Y=" + e.getY());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // Also update if the mouse is being dragged
                coordsLabel.setText("Dragging: X=" + e.getX() + ", Y=" + e.getY());
            }
        });
    }

    // A simple inner class for the drawing area
    class TrackerPanel extends JPanel {
        public TrackerPanel() {
            setBackground(Color.LIGHT_GRAY);
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MouseTracker().setVisible(true);
        });
    }
}