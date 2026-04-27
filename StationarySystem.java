import javax.swing.*;
import java.awt.event.*;

public class StationarySystem {

    public static void main(String[] args) {

        JFrame f = new JFrame("Stationary Shop");

        JCheckBox notebook = new JCheckBox("Notebook @ 50");
        JCheckBox pen = new JCheckBox("Pen @ 30");
        JCheckBox pencil = new JCheckBox("Pencil @ 10");

        notebook.setBounds(50,50,150,30);
        pen.setBounds(50,80,150,30);
        pencil.setBounds(50,110,150,30);

        JButton order = new JButton("Order");
        order.setBounds(50,150,100,30);

        f.add(notebook);
        f.add(pen);
        f.add(pencil);
        f.add(order);

        order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int total = 0;

                if (notebook.isSelected()) {
                    String qty = JOptionPane.showInputDialog("Enter Notebook Quantity");
                    int q = Integer.parseInt(qty);
                    total += q * 50;
                }

                if (pen.isSelected()) {
                    String qty = JOptionPane.showInputDialog("Enter Pen Quantity");
                    int q = Integer.parseInt(qty);
                    total += q * 30;
                }

                if (pencil.isSelected()) {
                    String qty = JOptionPane.showInputDialog("Enter Pencil Quantity");
                    int q = Integer.parseInt(qty);
                    total += q * 10;
                }

                JOptionPane.showMessageDialog(f, "Total = " + total);
                JOptionPane.showMessageDialog(f, "Successfully Ordered!");
            }
        });

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}