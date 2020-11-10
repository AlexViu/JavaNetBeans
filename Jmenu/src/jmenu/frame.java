/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmenu;

import javax.swing. *;
import java.awt.event. *;
import java.awt. *;
import javax.swing.JFrame;


/**
 *
 * @author aledom
 */
public class frame extends JFrame{
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    public frame() {

        setSize(800,600);
        setTitle("Ventanas modales y no modales");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        menuBar = new JMenuBar();
        menu = new JMenu("Primer Menú");
        menuBar.add(menu);
        
        menuItem = new JMenuItem("Opción 1");
        menuItem.addActionListener(new em(this) );
        menu.add(menuItem);
        menu.addSeparator();
        
        menuItem = new JMenuItem("Opcion 2");
        menu.add(menuItem);
        menu = new JMenu("Segundo Menú");
        menuBar.add(menu);
        
        add(menuBar);
    }
    
    class em implements ActionListener {
        JFrame miFrame;
        public em(JFrame f){
            miFrame=f;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            DialogoModal dialogoModal = new DialogoModal(miFrame);
            dialogoModal.pack(); 
            
            dialogoModal.setVisible(true);
            
            System.out.println(dialogoModal.getText());
        }
    }
}
