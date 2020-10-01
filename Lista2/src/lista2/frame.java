/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author aledom
 */
public class frame extends JFrame{
    private JPanel panel = new JPanel();
    
    private JComboBox combo;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private String[] paises = {"New York", "Espanya", "Francia" , "Portugal", "Alemania"};
    private final String names[] = {"Pepe", "Juan", "Antonio", "Alex"};
    private JList listJListNames;
    
    public frame() {

        setSize(500, 300);
        setTitle("Combos and List");
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);
        
        label = new JLabel("Select country");
        panel.add(label);
        
        combo = new JComboBox(paises);
        panel.add(combo,BorderLayout.NORTH);
        combo.addItemListener(new ListenerCombo());
        
        label2 = new JLabel("");
        panel.add(label2);
        
        label3 = new JLabel("Select Name");
        panel.add(label3);
        
        listJListNames = new JList(names);
        listJListNames.setVisibleRowCount(5);
        listJListNames.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        panel.setLayout(new FlowLayout());
        panel.add( new JScrollPane(listJListNames));
        
        listJListNames.addListSelectionListener(new ListListener());
        
        label4 = new JLabel("");
        panel.add(label4);
    }
    
    private class ListenerCombo implements ItemListener{
        public void itemStateChanged(ItemEvent e) {
            
            int indice = combo.getSelectedIndex();
            String s = paises[indice];
            label2.setText(s + " Is selected");
        }
    }
    
     private class ListListener implements ListSelectionListener{
        public void valueChanged( ListSelectionEvent e) {
            String lnames = listJListNames.getSelectedValuesList().toString();
            
            label4.setText("I will go with " + lnames);
        }
    }
    
}
