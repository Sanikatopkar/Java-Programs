import java.awt.*;
import javax.swing.*;

public class GridLayoutExample { // Fixed: Changed ( to {

    public static void main(String[] args) {
        // Fixed: Changed JFrane to JFrame and added '='
        JFrame frame = new JFrame("GridLayout Demo");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // 2 rows, 3 columns, 10px horizontal and vertical gaps
        frame.setLayout(new GridLayout(2, 3, 10, 10));

        // Loop to add 6 buttons (to fill a 2x3 grid)
        for (int i = 1; i <= 6; i++) {
            // Fixed: Changed frare to frame and "Button"+ 1 to "Button"+ i
            frame.add(new JButton("Button " + i));
        }

        frame.setVisible(true);
    }
}