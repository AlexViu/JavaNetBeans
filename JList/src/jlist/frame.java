/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author aledom
 */
public class frame extends JFrame {
    
    private JList list1;
    private JPanel panel1;
    private JButton b1, b2, b3;
    private DefaultListModel listModel = new DefaultListModel();
    
    public frame() {
    
        setTitle("JList");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(1,3,50,50));
        
        list1 = new JList();
        add(list1);

        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,1,10,10));
        b1=new JButton(">>>");
        b2=new JButton("<<<");
        b3=new JButton("Imprimir");
        
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        add(panel1);
    }
}
