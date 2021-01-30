package loginSystem;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame;
    JButton button = new JButton("Submit");
    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
    JTextField userField;
    JPasswordField passwordField;
    HashMap<String, String> userData = new HashMap<String, String>();

    LoginPage(HashMap loginInfo) {
        userData = loginInfo;
        System.out.println(userData);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // frame.setLocationRelativeTo(null);
        frame.setSize(900, 800);

        JLabel title = new JLabel("Login");
        title.setFont(new Font("Comics Sans", Font.BOLD, 40));
        title.setBounds(330, 250, 200, 100);
        title.setForeground(Color.white);

        // Backgriund Label
        JLabel background = new JLabel();
        background.setBounds(0, 0, 900, 800);
        ImageIcon image = new ImageIcon("frame.jpg");
        background.setIcon(image);

        // Username
        JLabel userlabel = new JLabel("Username");
        userlabel.setBounds(240, 350, 100, 30);
        userlabel.setForeground(Color.white);
        userlabel.setFont(new Font("Sans Serif", Font.BOLD, 20));

        // Password
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(240, 420, 100, 30);
        passLabel.setForeground(Color.white);
        passLabel.setFont(new Font("Sans Serif", Font.BOLD, 20));

        // Usernae Text
        userField = new JTextField();
        userField.setBounds(370, 350, 200, 30);
        userField.setFont(new Font("Sans Serif", Font.PLAIN, 20));

        // Password Text
        passwordField = new JPasswordField();
        passwordField.setBounds(370, 420, 200, 30);
        passwordField.setFont(new Font("Sans Serif", Font.PLAIN, 20));

        button.setBounds(330, 490, 100, 40);
        button.setFont(new Font("Sans Serif", Font.BOLD, 16));
        button.setForeground(Color.white);
        button.setBackground(new Color(0x4b7bec));
        button.setFocusable(false);
        button.setCursor(cursor);
        button.addActionListener(this);

        // Adding the all compo. in the frame
        frame.add(title);
        frame.add(userlabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passwordField);
        frame.add(button);
        frame.add(background);
        frame.setVisible(true);
    }

    // @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String username = userField.getText();
            String password = String.valueOf(passwordField.getPassword());
            if (userData.containsKey(username)) {
                if (userData.get(username).equals(password)) {
                    WelcomePage welcomePage = new WelcomePage(username);
                    frame.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password!", "title", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username not found!", "title", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
