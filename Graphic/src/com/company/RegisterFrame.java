package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterFrame extends JFrame implements ActionListener {
    private JTextField txtfname, txtlname;
    private JLabel lblMessage;
    private JButton btnRegister;

    public RegisterFrame() {
        super("Registration");
        setLayout(new FlowLayout());

        lblMessage = new JLabel("Enter Names");
        add(lblMessage);
        txtfname = new JTextField(15);
        add(txtfname);
        txtlname = new JTextField(15);
        add(txtlname);
        btnRegister = new JButton("Register");
        //register event handler
        btnRegister.addActionListener(this);
        add(btnRegister);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==btnRegister){
            String fname = txtfname.getText();
            String lname = txtlname.getText();
            lblMessage.setText("Welcome: "+fname+" "+lname);
            JOptionPane.showMessageDialog(null, "Registration Succesful", "Success", JOptionPane.PLAIN_MESSAGE);
        }
    }

}

