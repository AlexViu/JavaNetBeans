/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;



/**
 *
 * @author aledom
 */
public class frame extends JFrame{
    
    private JPanel panel1,panel2,panel3;
    private JButton b1, b2, b3, b4, b5, b6, b7;
    private JLabel e1,e2,e3,e4,e5;
    private JTextField t1,t2,t3,t4,t5;
    
    public frame() {
        
        setSize(500,300);
        setTitle("My series");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(5,2,10,10));
        panel3.setLayout(new FlowLayout());
        
        add(panel1);
        panel1.add(panel3,BorderLayout.NORTH);
        panel1.add(panel2, BorderLayout.CENTER);
        
        b1=new JButton("|<");
        b2=new JButton("<");
        b3=new JButton(">");
        b4=new JButton(">|");
        b5=new JButton("+");
        b6=new JButton("-");
        b7=new JButton("*");
        
        panel3.add(b1);
        panel3.add(b2);
        panel3.add(b3);
        panel3.add(b4);
        panel3.add(b5);
        panel3.add(b6);
        panel3.add(b7);
        
    }
}
