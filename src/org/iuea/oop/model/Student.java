/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iuea.oop.model;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class Student extends JFrame {
    
    public Student() {
        super("Student Details");
        this.setSize(650, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creating a panel to hold the buttons
        JPanel btns = new JPanel();
        btns.setLayout(null);
        
        //Creating buttons
        JButton stds = new JButton("Students");
        stds.setBounds(0, 0, 120, 35);
        JButton course = new JButton("Courses");
        course.setBounds(0,30,120,35);
        JButton courseUnits = new JButton("Course Units");
        courseUnits.setBounds(0,60,120,35);
        JButton lecturers = new JButton("Lecturers");
        lecturers.setBounds(0,90,120,35);
        
        //Creating panels for each buttons
        JPanel stdsPanel = new JPanel();
        JPanel coursePanel = new JPanel();
        JPanel courseUnitPanel = new JPanel();
        JPanel lecturersPanel = new JPanel();
        
        stdsPanel.setLayout(null);
        stdsPanel.setBounds(120,0,530,390);
        stdsPanel.setVisible(true);
        
        //Working with the stdsPanel
        JButton add = new JButton("Add");
        add.setBounds(30, 10, 100,30);
        
        JButton edit = new JButton("Edit");
        edit.setBounds(150,10, 100,30);
        
        JButton delete = new JButton("Delete");
        delete.setBounds(270,10, 100,30);
        
        //Form Panel for students Details
        JPanel form = new JPanel();
        form.setLayout(null);
        form.setBackground(Color.lightGray);
        form.setBounds(10, 40, 500, 300);
        
        //creating form components
        JLabel fNameLabel = new JLabel("First Name: ");
        fNameLabel.setBounds(10,10,100,30);
        JTextField fName = new JTextField();
        fName.setBounds(90,10,200,30);
        
        JLabel lNameLabel = new JLabel("Last Name: ");
        lNameLabel.setBounds(10,40,100,30);
        JTextField lName = new JTextField();
        lName.setBounds(90,40,200,30);
        
        JLabel sexLabel = new JLabel("Sex: ");
        sexLabel.setBounds(8,70,100,30);
        String[] sexes = {"Male", "Female"};
        JComboBox sex = new JComboBox(sexes);
        sex.setBounds(90,70,200,30);
        
        JLabel dobLabel = new JLabel("Date of birth: ");
        dobLabel.setBounds(9,100,100,30);
        JDateChooser dob = new JDateChooser();
        dob.setBounds(95,100,200,30);
        
        JButton submit = new JButton("Submit");
        submit.setBounds(100,150,100,30);
        JButton submit2 = new JButton("Submit");
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(200,150,100,30);
        
        //Creating a table and adding in records
        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(10, 40, 500, 300);
        Object[][] rowData = {{"Riak","Ajuong","M", new Date(1992, 11, 2)},
            {"Thomas","Tesfaldet","F", new Date(1995,1, 4)},
            {"Heaven","Yohannes","M", new Date(1998,1, 4)},
            {"Mihreteab","Nahom","F", new Date(1890,1, 4)}
        };
        Object[] columnNames = {fNameLabel.getText(),lNameLabel.getText(), sexLabel.getText(), dobLabel.getText()};
        
        DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
        
        JTable table = new JTable(dtm);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setBounds(10, 40, 500, 300);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(10, 40, 500, 300);
        sp.getViewport().add(table);
        
        tablePanel.add(sp);
        
        //adding components into the form Panel
        form.add(fNameLabel);
        form.add(fName);
        form.add(lNameLabel);
        form.add(lName);
        form.add(sexLabel);
        form.add(sex);
        form.add(dobLabel);
        form.add(dob);
        form.add(submit);
        form.add(cancel);
        
        
        
        //adding components into the stdPanels
        stdsPanel.add(add);
        stdsPanel.add(edit);
        stdsPanel.add(delete);
        stdsPanel.add(tablePanel);
        tablePanel.setVisible(true);
        stdsPanel.add(form);
        form.setVisible(false);
        
        
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.remove(submit2);
                form.add(submit);
                fName.setText("");
                lName.setText("");
                try {
                    tablePanel.setVisible(false);
                    form.setVisible(true);
                } catch(Exception ex) {
                    System.out.println(ex.getMessage());
                }
                
                
            }
            
        });
        
        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tablePanel.setVisible(true);
                form.setVisible(false);
            }
                
        });
        
        submit.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tablePanel.setVisible(true);
                        form.setVisible(false);
                        
                        dtm.addRow(new Object[]{fName.getText(),lName.getText(), sex.getSelectedItem(), dob.getDate()});
                    }
                
        });
        
        edit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tablePanel.setVisible(false);
                form.setVisible(true);
                
                int i = table.getSelectedRow();
                
                if(i>=0) {
                    fName.setText(dtm.getValueAt(i, 0).toString());
                    lName.setText(dtm.getValueAt(i, 1).toString());
                    sex.setSelectedItem(dtm.getValueAt(i, 2).toString());
                    dob.setDate((Date) dtm.getValueAt(i, 3));
                }
                
                
                submit2.setBounds(100,150,100,30);
                form.remove(submit);
                form.add(submit2);
                
                
            }
        });
        
        submit2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                
                if(i >= 0) {
                    dtm.setValueAt(fName.getText(), i, 0);
                    dtm.setValueAt(lName.getText(), i, 1);
                    dtm.setValueAt(sex.getSelectedItem(), i, 2);
                    dtm.setValueAt(dob.getDate(), i, 3);
                    
                    tablePanel.setVisible(true);
                    form.setVisible(false);
                } else {
                    System.out.println("Can not edit an empty row");
                }
            }
            
        });
        
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                tablePanel.setVisible(true);
                form.setVisible(false);
                
                if(i >= 0) {
                    dtm.removeRow(i);
                } else {
                    JOptionPane.showMessageDialog(null, "Please Select A Row");
                }
            }
        });
        
        if(stds.isSelected()){
            stds.setBackground(Color.red);
        }
        
        stds.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stds.setForeground(Color.blue);
                stdsPanel.setVisible(true);
                
                coursePanel.setVisible(false);
                courseUnitPanel.setVisible(false);
                lecturersPanel.setVisible(false);
            }
        
        });
        
        //customizing coursePanel
        coursePanel.setLayout(null);
        coursePanel.setBounds(120,0,530,390);
        
        course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                course.setForeground(Color.blue);
                stdsPanel.setVisible(false);
                 
                coursePanel.setBackground(Color.gray);
                coursePanel.setVisible(true);
            }
        
        });
        
        //customising courseUnitPanel
        courseUnitPanel.setLayout(null);
        courseUnitPanel.setBounds(120,0,530,390);
        
        courseUnits.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                courseUnits.setForeground(Color.blue);
                stdsPanel.setVisible(false);
                coursePanel.setVisible(false);
                
                courseUnitPanel.setBackground(Color.orange);
                courseUnitPanel.setVisible(true);
            }
        });
        
        //customising lecturersPanel
        lecturersPanel.setLayout(null);
        lecturersPanel.setBounds(120,0,530,390);
        
        lecturers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lecturers.setForeground(Color.blue);
                stdsPanel.setVisible(false);
                coursePanel.setVisible(false);
                courseUnitPanel.setVisible(false);
                
                lecturersPanel.setBackground(Color.magenta);
                lecturersPanel.setVisible(true);
            }
        
        });
        
        //adding contents into the panel
        btns.add(stds);
        btns.add(course);
        btns.add(courseUnits);
        btns.add(lecturers);
     
        
        //adding Panels into the btn main panel
        btns.add(stdsPanel);
        btns.add(coursePanel);
        btns.add(courseUnitPanel);
        btns.add(lecturersPanel);
        
        //adding panels into the Frame
        this.add(btns);
        
        this.setVisible(true);
    }
    
    
}
