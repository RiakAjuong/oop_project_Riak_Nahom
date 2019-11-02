/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iuea.oop.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mac
 */
public class LoginView extends JFrame {
    JPanel pane;
    
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    public Object userName;
    
    public LoginView() {
        super("Login Form: ");
        setSize(screenWidth / 2, screenHeight / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocation(screenWidth / 4, screenHeight / 4);
        
        //creating UI components
        pane = new JPanel();//panel for  components
        pane.setSize(200,200);
        pane.setLayout(null);
        //Creating labels
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(90, 60, 150, 40);
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(90, 90, 150, 40);
        
        //Creating textFields
        JTextField username = new JTextField();
        username.setBounds(155, 60, 200, 30);
        JPasswordField password = new JPasswordField();
        password.setBounds(155, 90, 200, 30);
        
        //Creating buttons
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(155, 130, 90, 30);
        JButton login = new JButton("Login");
        login.setBounds(270,130,90,30);
        
        //Adding components to the panel
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        pane.add(cancel);
        pane.add(login);
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getUsername = username.getText();
                String getPassword = password.getText();
                
                if(getUsername.trim().equals("admin") && getPassword.trim().equals("admin")) {
                    JOptionPane.showMessageDialog(null, "User logged in successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Username and password does not match what is expected");
                    try {
                        username.setText("");
                        password.setText("");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    
                }
            }
        });
        
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        
        
        });
        
        add(pane);
        setBackground(Color.gray);
        setVisible(true);
    }

    public class login {

        public login() {
        }
    }
    
}
