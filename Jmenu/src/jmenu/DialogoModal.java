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
public class DialogoModal extends JDialog {
    private JTextField textField;
    public DialogoModal(JFrame padre) {
        //el constructor recibe como parámetro aquella ventana
        // que le ha llamado, o sea, su padre
        super(padre, true); 
        //invoco el constructor de la case, con dos 
        //parámetros: quién es su padre 
        //después true para modal y false para no modal

        setTitle("Mete un dato");
        textField = new JTextField(20);
         add(textField);
        // Se oculta la ventana al pulsar <enter> sobre el textfield
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false);
            }
        });
    }
    
        public String getText() {
            return textField.getText();
        }
    
}
