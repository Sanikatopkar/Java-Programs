import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Reverse Number");

        JTextField input = new JTextField(10);
        JTextField output = new JTextField(10);

        JButton btn = new JButton("Reverse");

        f.setLayout(new java.awt.FlowLayout());

        f.add(new JLabel("Enter Number:"));
        f.add(input);
        f.add(btn);
        f.add(new JLabel("Reverse:"));
        f.add(output);

        btn.addActionListener(e -> {
            String num = input.getText();
            String rev = new StringBuilder(num).reverse().toString();
            output.setText(rev);
        });

        f.setSize(300,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
