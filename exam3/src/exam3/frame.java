/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam3;

import javax.swing. *;
import java.awt.event. *;
import java.awt. *;
import javax.swing.JFrame;

/**
 *
 * @author aledom
 */
public class frame extends JFrame{
    
    JTextField text1, text2,text3;
    JLabel label1, label2,label3, label4;
    JButton boton;
    JPanel panel;
    
    public frame(){
        setTitle ("Gastos");
        setSize (500,300);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout (new GridLayout (4,2, 10,10));
        
        label1 = new JLabel ("Luz");
        panel.add(label1);
        
        text1 = new JTextField(20);
        panel.add(text1);
        
        label2 = new JLabel ("Agua");
        panel.add(label2);
        
        text2 = new JTextField(20);
        panel.add(text2);
        
        label3 = new JLabel ("Gas");
        panel.add(label3);
        
        text3 = new JTextField(20);
        panel.add(text3);
        
        boton = new JButton("Calcular");
        panel.add(boton);
        
        label4 = new JLabel ("");
        panel.add(label4);
        
        add(panel);
        
        boton.addActionListener (new ButtonListener ());
    
    }
    
    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String num1 = text1.getText();
            String num2 = text2.getText();
            String num3 = text3.getText();
            
            int num1r = Integer.parseInt(num1);
            int num2r = Integer.parseInt(num2);
            int num3r = Integer.parseInt(num3);
            
            int res = num1r+num2r+num3r;
            String resultado = "El resultado es: " + res;
            label4.setText(resultado);
        }
    
    }
}
