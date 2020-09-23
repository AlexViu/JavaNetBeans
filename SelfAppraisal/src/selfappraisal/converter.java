/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aledom
 */
package selfappraisal;
import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class converter extends JFrame {
    
    JTextField textField1, textField2;
    JPanel panel = new JPanel ();
    
    public converter() {

        setTitle ("Converter");
        
        setSize (300,200);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        
        panel.setLayout (new GridLayout (3,2));
        
        JLabel label1 = new JLabel ("Celsius Grades");
        JLabel label2 = new JLabel ("Kelvin Grades");
        
        textField1 = new JTextField (20);
        textField2 = new JTextField (20);
        
        textField1.addActionListener (new TextFieldListener ());
        textField2.addActionListener (new TextFieldListener2 ());
        
        JButton button = new JButton ("Clear");
        button.addActionListener (new ButtonListener ());
        
        panel.add (label1);
        panel.add (textField1);
        panel.add (label2);
        panel.add (textField2);
        panel.add (button);
        add (panel);
    }
    
    class TextFieldListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String text = textField1.getText();
            Double celsius = Double.parseDouble(text);
            celsius = celsius+1;
            text = String.valueOf(celsius);
            textField2.setText (text);
            

        }
    }   

    class TextFieldListener2 implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            
            String text2 = textField2.getText();
            Double kelvin = Double.parseDouble(text2);
            kelvin = kelvin-1;
            text2 = String.valueOf(kelvin);
            textField1.setText (text2);
            

        }
    }   
    
    class ButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            textField1.setText ("");
            textField2.setText ("");
        }
    }

}
