/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlistexercise;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author aledom
 */
public class frame extends JFrame {
    private  JList list, list2;
    private DefaultListModel listModel = new DefaultListModel();
    private JButton b1,b2,b3;
    private JPanel panel;
    
    public frame() {
        setTitle("Jlist");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(1,3,50,50));
        list = new JList(listModel);
        list.setVisibleRowCount(5);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(list));
        
        panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(3,1,10,10));
        b1 = new JButton(">>>");
        b2 = new JButton("<<<");
        b3 = new JButton("Imprimir");
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        setLayout(new GridLayout(1,3,50,50));
        list2 = new JList(listModel);
        list2.setVisibleRowCount(5);
        list2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(list2));
    
    }
}
