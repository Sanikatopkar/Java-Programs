import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="factorialappl.class" width="400" height="400"></applet> */

public class factorialappl extends Applet implements ActionListener {
    Label lblNum, lblRes;
    TextField txtNum, txtRes;
    Button btnCalc;

    public void init() {
        lblNum = new Label("Enter Number:");
        txtNum = new TextField(10);
        btnCalc = new Button("Calculate Factorial");
        lblRes = new Label("Result:");
        txtRes = new TextField(15);
        txtRes.setEditable(false);

        add(lblNum); add(txtNum);
        add(btnCalc);
        add(lblRes); add(txtRes);

        btnCalc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(txtNum.getText());
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            txtRes.setText(String.valueOf(fact));
        } catch (NumberFormatException ex) {
            txtRes.setText("Invalid Input");
        }
    }
}