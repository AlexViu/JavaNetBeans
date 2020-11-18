/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import DAO.pelicula;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author aledom
 */
public class frame extends JFrame {
    private ArrayList<pelicula> peliculas = new ArrayList();
    
    private JPanel panel1 = new JPanel ();
    private JPanel panel2 = new JPanel ();
    private JPanel panel3 = new JPanel ();
    private JPanel panel4 = new JPanel ();
    
    private JButton backwards, forward, search, all, nuevo, edit, add_pel, delete, updatep;
    private JLabel e1, e2, e3, e4, e5;
    private JTextField id, idSearch, tittle, director, genero;
    
    private listener myListener;
    
    public frame() {
    
        setSize (800,200);
        setTitle ("Peliculas");
        setDefaultCloseOperation (EXIT_ON_CLOSE);        
        
        panel1.setLayout (new BorderLayout ());

        panel2.setLayout (new FlowLayout ());
        panel3.setLayout (new FlowLayout ());
        panel4.setLayout (new FlowLayout ());
        add (panel1);
        panel1.add (panel3, BorderLayout.SOUTH);
        panel1.add (panel2, BorderLayout.CENTER);
        panel1.add (panel4, BorderLayout.NORTH);

        e1 = new JLabel ("ID");
        id = new JTextField (10);
        panel2.add (e1);
        panel2.add (id);
        e2 = new JLabel ("Tittle");
        tittle = new JTextField(10);
        panel2.add (e2);
        panel2.add (tittle);
        e4 = new JLabel ("Director");
        director = new JTextField (10);
        panel2.add (e4);
        panel2.add (director);
        e5 = new JLabel ("Genre");
        genero = new JTextField (10);
        panel2.add (e5);
        panel2.add (genero);
        
        backwards = new JButton ("<");
        forward = new JButton (">");
        panel2.add (backwards);
        panel2.add (forward);
        
        e3 = new JLabel ("ID to find:");
        idSearch = new JTextField (10);
        search = new JButton ("Search");
        all = new JButton ("All");
        panel4.add (e3);
        panel4.add (idSearch);
        panel4.add (search);
        panel4.add (all);
        
        nuevo = new JButton ("New Movie");
        edit = new JButton ("Edit");
        updatep = new JButton ("Update");
        add_pel = new JButton ("Add");
        delete = new JButton ("Delete");
        
        panel3.add(nuevo);
        panel3.add(add_pel);
        panel3.add(edit);
        panel3.add(updatep);
        panel3.add(delete);
        

        myListener = new listener (id, tittle, director, genero, idSearch, backwards, forward, search, all, nuevo, edit, add_pel, delete, updatep);
        backwards.addActionListener (myListener);
        forward.addActionListener (myListener);
        search.addActionListener (myListener);
        all.addActionListener (myListener);
        nuevo.addActionListener (myListener);
        edit.addActionListener (myListener);
        add_pel.addActionListener (myListener);
        delete.addActionListener (myListener);
        updatep.addActionListener (myListener);

        forward.setEnabled (false);
        backwards.setEnabled (false);
        add_pel.setVisible(false);
        updatep.setVisible(false);
        id.setEditable(false);
        tittle.setEditable(false);
        director.setEditable(false);
        genero.setEditable(false);
        
        
    }
}
