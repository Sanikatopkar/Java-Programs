import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Counter");

        JLabel label = new JLabel("Counter:");
        JTextField tf = new JTextField("0", 10);

        JButton up = new JButton("Count Up");
        JButton down = new JButton("Count Down");
        JButton reset = new JButton("Reset");

        // Layout
        f.setLayout(new FlowLayout());
        f.add(label);
        f.add(tf);
        f.add(up);
        f.add(down);
        f.add(reset);

        // Button actions
        up.addActionListener(e -> {
            int val = Integer.parseInt(tf.getText());
            tf.setText(String.valueOf(val + 1));
        });

        down.addActionListener(e -> {
            int val = Integer.parseInt(tf.getText());
            tf.setText(String.valueOf(val - 1));
        });

        reset.addActionListener(e -> {
            tf.setText("0");
        });

        f.setSize(300,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}