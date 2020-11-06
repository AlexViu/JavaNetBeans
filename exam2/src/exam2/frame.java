/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import javax.swing. *;
import java.awt.event. *;
import java.awt. *;
import javax.swing.JFrame;

/**
 *
 * @author aledom
 */
public class frame extends JFrame {
    JLabel label1,label2,label3,label4,label5;
    JLabel l1,l2,l3,l4,l5;
    JPanel panel, p1,p2,p3,p4,p5;
    JButton boton;
    JRadioButton r1_1, r1_2, r1_3, r2_1, r2_2, r2_3, r3_1, r3_2, r3_3, r4_1, r4_2, r4_3, r5_1, r5_2, r5_3;
    ButtonGroup grupo1,grupo2,grupo3,grupo4,grupo5;
    
    
    public frame() {
        setTitle ("Test");
        setSize (500,1200);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout (new GridLayout (6,1, 10,10));
        
        //Pregunta 1
        
        p1 = new JPanel();
        p1.setLayout (new GridLayout (5,1, 10,10));
        l1 = new JLabel("Pregunta: 1");
        label1 = new JLabel("¿Que es la maquina virtual de java?");
        
        r1_1 = new JRadioButton("Una maquina de cafes");
        r1_2 = new JRadioButton("El sw que se encarga de interpretar el codigo Java y ejecutarlo");
        r1_3 = new JRadioButton("Ambas son correctas");
        
        grupo1 = new ButtonGroup();
        grupo1.add(r1_1);
        grupo1.add(r1_2);
        grupo1.add(r1_3);
        
        p1.add(l1);
        p1.add(label1);
        p1.add(r1_1);
        p1.add(r1_2);
        p1.add(r1_3);
        panel.add(p1);
        
        //pregunta 2
        
        p2 = new JPanel();
        p2.setLayout (new GridLayout (5,1, 10,10));
        l2 = new JLabel("Pregunta: 2");
        label2 = new JLabel("Las clases Swing");
        
        r2_1 = new JRadioButton("Dan soporte a los GUI");
        r2_2 = new JRadioButton("Son clases de baile");
        r2_3 = new JRadioButton("Ambas son correctas");
        
        grupo2 = new ButtonGroup();
        grupo2.add(r2_1);
        grupo2.add(r2_2);
        grupo2.add(r2_3);
        
        p2.add(l2);
        p2.add(label2);
        p2.add(r2_1);
        p2.add(r2_2);
        p2.add(r2_3);
        panel.add(p2);
        
        //pregunta 3
        
        p3 = new JPanel();
        p3.setLayout (new GridLayout (5,1, 10,10));
        l3 = new JLabel("Pregunta: 3");
        label3 = new JLabel("JavaFX es:");
        
        r3_1 = new JRadioButton("Los efectos especiales de Java");
        r3_2 = new JRadioButton("El nuevo soporte GUI de Java");
        r3_3 = new JRadioButton("Ambas son correctas");
        
        grupo3 = new ButtonGroup();
        grupo3.add(r3_1);
        grupo3.add(r3_2);
        grupo3.add(r3_3);
        
        p3.add(l3);
        p3.add(label3);
        p3.add(r3_1);
        p3.add(r3_2);
        p3.add(r3_3);
        panel.add(p3);

        //Pregunta 4
        
        p4 = new JPanel();
        p4.setLayout (new GridLayout (5,1, 10,10));
        l4 = new JLabel("Pregunta: 4");
        label4 = new JLabel("¿NetBeans es pero que Eclipse?");
        
        r4_1 = new JRadioButton("Si, pero solo se puede desarrollar en java");
        r4_2 = new JRadioButton("No, pero eclipse es de pago");
        r4_3 = new JRadioButton("A y B son incorrectas");
        
        grupo4 = new ButtonGroup();
        grupo4.add(r4_1);
        grupo4.add(r4_2);
        grupo4.add(r4_3);
        
        p4.add(l4);
        p4.add(label4);
        p4.add(r4_1);
        p4.add(r4_2);
        p4.add(r4_3);
        panel.add(p4);
        
        //Pregunta 5
        
        p5 = new JPanel();
        p5.setLayout (new GridLayout (5,1, 10,10));
        l5 = new JLabel("Pregunta: 5");
        label5 = new JLabel("¿Oracle es la compañia propietaria de Java?");
        
        r5_1 = new JRadioButton("Si");
        r5_2 = new JRadioButton("No");
        r5_3 = new JRadioButton("Solo del 50%");
        
        grupo5 = new ButtonGroup();
        grupo5.add(r5_1);
        grupo5.add(r5_2);
        grupo5.add(r5_3);
        
        p5.add(l5);
        p5.add(label5);
        p5.add(r5_1);
        p5.add(r5_2);
        p5.add(r5_3);
        panel.add(p5);
        
        boton = new JButton("Corregir");
        panel.add(boton);
        
        add(panel);
    }
}
