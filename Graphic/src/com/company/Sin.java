package com.company;
import javax.swing.*;
import java.lang.Math;
import java.awt.event.*;

public class Sin extends Add implements ActionListener {
    private JLabel lblMessage;

    @Override

    public void actionPerformed(ActionEvent s){
        if(s.getSource()==super.btnsin){

            String number=super.snum.getText();
            double num = Integer.parseInt(number);

            double sin = Math.sin(num);
            lblMessage.setText("The sin of "+super.num2+" is: "+num);
        }



    }
}