import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ImageSelector extends JFrame {
    private JComboBox<String> imageList;
    private JLabel imageDisplay;

    // Array of image filenames (Make sure these files exist in your folder!)
    private String[] fileNames = {"image1.jpg", "image2.jpg", "image3.jpg"};

    public ImageSelector() {
        setTitle("Image Selector GUI");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // 1. Setup the JComboBox
        imageList = new JComboBox<>(fileNames);
        add(imageList, BorderLayout.NORTH);

        // 2. Setup the JLabel to display images
        imageDisplay = new JLabel("", SwingConstants.CENTER);
        add(imageDisplay, BorderLayout.CENTER);

        // 3. Add ItemListener to handle selection changes
        imageList.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Only trigger when an item is SELECTED (not deselected)
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedFile = (String) imageList.getSelectedItem();
                    updateImage(selectedFile);
                }
            }
        });

        // Load the first image by default
        updateImage(fileNames[0]);
    }

    private void updateImage(String name) {
        try {
            // Attempt to load the image from the local folder
            ImageIcon icon = new ImageIcon(name);
            
            // Resize image to fit the label (Optional but recommended)
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(400, 300, Image.SCALE_SMOOTH);
            
            imageDisplay.setIcon(new ImageIcon(scaledImg));
        } catch (Exception ex) {
            imageDisplay.setText("Image not found: " + name);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ImageSelector().setVisible(true);
        });
    }
}