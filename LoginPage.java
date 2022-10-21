import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    private final HashMap<String, String> logininfo;
    HashMap<String, String> Logininfo = new HashMap<String, String>();
    public Button Resetbutton;
    public TextField field;
    public JPasswordField field1;
    public Object Savebutton;

    LoginPage(HashMap<String, String> logininfoOriginal) {
        logininfo = logininfoOriginal;
        JLabel label = new JLabel();
        label.setText("Confidential Message");
        label.setBounds(350, 10, 300, 30);
        label.setFont(new Font("Courier", Font.PLAIN, 25));
        label.setOpaque(false);

        JLabel label3 = new JLabel();
        label3.setIcon(new ImageIcon("C:\\Users\\LOURDHU RAJU\\Documents\\Login System\\confidential.png"));
        label3.setBounds(415, 70, 130, 130);
        label3.setBackground(Color.white);
        label3.setOpaque(true);

        JLabel label4 = new JLabel();
        label4.setBackground(Color.white);
        label4.setText("verification");
        label4.setBounds(420, 225, 200, 40);
        label4.setFont(new Font("Courier", Font.BOLD, 18));

        JLabel label1 = new JLabel();
        label1.setText("Username");
        label1.setOpaque(true);
        label1.setBounds(255, 320, 100, 30);
        label1.setFont(new Font("Courier", Font.PLAIN, 16));
        label1.setBackground(Color.white);

        JLabel label2 = new JLabel();
        label2.setText("Password");
        label2.setOpaque(true);
        label2.setBounds(255, 360, 100, 30);
        label2.setFont(new Font("Courier", Font.PLAIN, 16));
        label2.setBackground(Color.white);

        JTextField field = new JTextField();
        field.setBounds(380, 320, 200, 30);
        field.setVisible(true);
        field.setBackground(Color.LIGHT_GRAY);

        JPasswordField field1 = new JPasswordField();
        field1.setBounds(380, 360, 200, 30);
        field1.setVisible(true);
        field1.setBackground(Color.LIGHT_GRAY);

        JButton Savebutton = new JButton();
        Savebutton.setSize(100, 20);
        Savebutton.setText("Login");
        Savebutton.setFocusable(false);
        Savebutton.setBounds(495, 410, 75, 20);
        Savebutton.setOpaque(true);
        Savebutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String userid = field.getText();
                String password = String.valueOf(field1.getPassword());
                if (logininfo.containsKey(userid)) {
                    if (logininfo.get(userid).equals(password)) {
                        Data mydata = new Data();

                    }
                }

            }

        });

        JButton Resetbutton = new JButton();
        Resetbutton.setSize(100, 20);
        Resetbutton.setText("Reset");
        Resetbutton.setFocusable(false);
        Resetbutton.setBounds(385, 410, 75, 20);
        Resetbutton.setOpaque(true);
        Resetbutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("");
                field1.setText("");

            }
        });

        JPanel panel = new JPanel();
        panel.setSize(1000, 720);
        panel.setBackground(Color.white);
        panel.setLayout(field.getLayout());
        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(field);
        panel.add(field1);
        panel.add(Savebutton);
        panel.add(Resetbutton);

        JFrame frame = new JFrame();
        // frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 750);
        frame.setVisible(true);
        frame.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
