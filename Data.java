import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Data {
  Data() {

    JLabel label = new JLabel();
    label.setIcon(new ImageIcon("C:\\Users\\LOURDHU RAJU\\Documents\\Login System\\Love.png"));
    label.setBounds(390, 350, 260, 260);
    label.setBackground(Color.WHITE);
    label.setOpaque(false);

    JLabel label1 = new JLabel();
    label1.setText("Life is much beautifull when you have the real friends");
    label1.setBounds(10, 700, 700, 30);
    label1.setOpaque(false);

    JPanel panel = new JPanel();
    panel.setSize(1000, 750);
    panel.add(label);
    panel.add(label1);

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(1000, 750);
    frame.setVisible(true);
    frame.add(panel);

  }

}
