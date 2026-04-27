import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField t;
    double num1, num2, result;
    char op;

    SimpleCalculator() {
        t = new JTextField();
        t.setBounds(30, 40, 240, 30);
        add(t);

        String buttons[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","=","+",
                "C"
        };

        int x = 30, y = 80;

        for (int i = 0; i < buttons.length; i++) {
            JButton b = new JButton(buttons[i]);
            b.setBounds(x, y, 50, 40);
            add(b);
            b.addActionListener(this);

            x += 60;
            if ((i + 1) % 4 == 0) {
                x = 30;
                y += 50;
            }
        }

        setSize(320, 350);
        setLayout(null);
        setVisible(true);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.equals(".")) {
            t.setText(t.getText() + s);
        }
        else if (s.equals("C")) {
            t.setText("");
        }
        else if (s.equals("=")) {
            num2 = Double.parseDouble(t.getText());

            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            t.setText("" + result);
        }
        else {
            num1 = Double.parseDouble(t.getText());
            op = s.charAt(0);
            t.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}