/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iuea.oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.iuea.oop.model.Student;
import org.iuea.oop.views.LoginView;

/**
 *
 * @author mac
 */
public class Main {
    
    public static void main(String[] args) {
        LoginView lv = new LoginView();
        //Student s;
        lv.login.addActionListener((ActionEvent e) -> {
            String username = lv.username.getText();
            String password = lv.password.getText();
            if (username.trim().equals("admin") && password.trim().equals("admin")) {
                JOptionPane.showMessageDialog(null, "User logged in successfully");
                lv.username.setText("");
                lv.password.setText("");
                Student s1 = new Student();
                lv.dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Username and password do not match");
                lv.username.setText("");
                lv.password.setText("");
            }
        });
    }
}
