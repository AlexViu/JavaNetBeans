/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import javax.swing. *;
import java.awt.event. *;
import java.awt. *;
import javax.swing.JFrame;

/**
 *
 * @author aledom
 */
public class frame extends JFrame {

    JPanel panel;
    JButton boton;
    JComboBox combo;
    String[] cursos = {"1DAM", "2DAM"};
    
    public frame(){
        setSize(500, 300);
        setTitle("Ejercicio 1");
        panel = new JPanel();
        panel.setLayout (new GridLayout (2,1, 10,10));
        
        combo = new JComboBox(cursos);
        boton = new JButton("BOTON");
        
        panel.add(combo);
        panel.add(boton);
        
        add(panel);
    }
}
