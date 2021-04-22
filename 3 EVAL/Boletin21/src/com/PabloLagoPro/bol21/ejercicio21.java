package com.PabloLagoPro.bol21;

import javax.swing.*;

public class ejercicio21 {

    private JFrame marco;
    private JPanel Campo1;
    private JLabel etqprimera;
    private JTextField nameTextField1;
    private JTextField userNameTextField2;
    private JComboBox comboBox1;
    private JTextField automaticTextField4;
    private JComboBox comboBox2;
    private JTextField automaticTextField3;
    private JPasswordField passwordPasswordField;
    private JPasswordField confirmItPasswordField;
    private JButton cancelButton;
    private JButton okButton;
    private JLabel fullNameLabel;
    private JLabel userIDLabel;
    private JLabel groupLabel;
    private JLabel homeDirectoryLabel;
    private JLabel loginShellLabel;
    private JLabel passwordLabel;
    private JLabel confirmLabel;

    public void crearinterfaz(){
        marco = new JFrame("Compoñentes");
        Campo1 = new JPanel();
        etqprimera = new JLabel("NAME: ");
        fullNameLabel = new JLabel("FULL NAME");
        userIDLabel = new JLabel("USER ID");
        groupLabel = new JLabel("GROUP");
        homeDirectoryLabel = new JLabel("HOME DIRECTORY");
        loginShellLabel = new JLabel("LOGIN SHELL");
        passwordLabel = new JLabel("PASSWORD");
        confirmLabel = new JLabel("CONFRIM");
        nameTextField1 = new JTextField();
        automaticTextField3 = new JTextField();
        automaticTextField4 = new JTextField();
        userNameTextField2 = new JTextField();
        passwordPasswordField = new JPasswordField();
        confirmItPasswordField = new JPasswordField();
        cancelButton = new JButton("CANCEL");
        okButton= new JButton("OK");
        comboBox2 = new  JComboBox();
        comboBox1 = new  JComboBox();

        Campo1.add(etqprimera);
        Campo1.add(fullNameLabel);
        Campo1.add(userIDLabel);
        Campo1.add(groupLabel);
        Campo1.add(homeDirectoryLabel);
        Campo1.add(loginShellLabel);
        Campo1.add(passwordLabel);
        Campo1.add(confirmLabel);
        Campo1.add(nameTextField1);
        Campo1.add(automaticTextField3);
        Campo1.add(automaticTextField4);
        Campo1.add(userNameTextField2);
        Campo1.add(automaticTextField4);
        Campo1.add(passwordPasswordField);
        Campo1.add(confirmItPasswordField);
        Campo1.add(cancelButton);
        Campo1.add(okButton);
        Campo1.add(comboBox2);
        Campo1.add(comboBox1);


        marco.add(Campo1);

        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }


}

