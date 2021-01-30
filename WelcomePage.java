package loginSystem;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.*;

public class WelcomePage {
    WelcomePage(String username) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome Page");
        frame.getContentPane().setBackground(new Color(0x2843d7));
        frame.setLayout(new BorderLayout());
        JLabel label = new JLabel("Welcome " + username);
        label.setFont(new Font("Sans Serif", Font.ITALIC, 40));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.white);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
