package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Add extends JFrame implements ActionListener {
    public JTextField fnum, snum;
    public int num1,num2, sum;
    public JLabel lblMessage;
    public JButton btnsin;
    private JButton btnAdd;


    public Add() {
        super("Operation");
        setLayout(new FlowLayout());

        lblMessage = new JLabel("Enter numbers");
        add(lblMessage);
        fnum = new JTextField(9);
        add(fnum);
        snum = new JTextField(9);
        add(snum);
        btnAdd = new JButton("ADD");
        btnAdd.addActionListener(this);
        add(btnAdd);
        btnsin = new JButton("Sin");
        btnsin.setBounds(50,150,100,30);
        add(btnsin);

    }

    @Override
    public void actionPerformed(ActionEvent add){
        if(add.getSource()==btnAdd){

            String firstnumber = fnum.getText();
            String secondnumber = snum.getText();
            num1 = Integer.parseInt(firstnumber);
            num2 = Integer.parseInt(secondnumber);

            sum=num1+num2;
            lblMessage.setText("The sum is: "+sum);
        }
    }




}
