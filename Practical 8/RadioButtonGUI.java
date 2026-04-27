import javax.swing.*;
import java.awt.event.*;

public class RadioButtonGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Gender Selection");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        JButton btn = new JButton("Submit");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        f.setLayout(new java.awt.FlowLayout());

        f.add(new JLabel("Select Gender:"));
        f.add(male);
        f.add(female);
        f.add(btn);

        btn.addActionListener(e -> {
            if (male.isSelected()) {
                JOptionPane.showMessageDialog(f, "Male Selected");
            } else if (female.isSelected()) {
                JOptionPane.showMessageDialog(f, "Female Selected");
            } else {
                JOptionPane.showMessageDialog(f, "Select one option");
            }
        });

        f.setSize(300,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}