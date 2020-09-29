/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacombo;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author aledom
 */
public class frame extends JFrame{
    private JComboBox combo;
    private JLabel label;
    private JPanel panel;
    private String[] images = {"Rabbit", "Cat", "Dog" , "Bird", "Pig"};
    private Icon img;
    
    public frame() {
        
        setSize(500, 300);
        setTitle("Combos and images");
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        add(panel);
        
        combo = new JComboBox(images);
        panel.add(combo,BorderLayout.NORTH);
        
        img = new ImageIcon(getClass().getResource("images/Rabbit.gif"));
        
        label = new JLabel();
        label.setText("Rabbit");
        label.setIcon(img);
        
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        label.setToolTipText("This is a label");
        
        panel.add( label,BorderLayout.CENTER);
        
        combo.addItemListener(new ListenerCombo());
        
    }

    private class ListenerCombo implements ItemListener{
        public void itemStateChanged(ItemEvent e) {
            int indice = combo.getSelectedIndex();
            String s = images[indice];
            img = new ImageIcon( getClass().getResource("images/" + s + ".gif"));
            label.setIcon(img);
            label.setText(s);
        }
    }
}
