/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstwindow;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author aledom
 */
public class myfirstframe extends JFrame {
    // I create an object of type JPanel
    JPanel panel = new JPanel ();
    private JButton blue,pink,yellow,green;
    
    public myfirstframe () {

        setTitle ("Hello !!!");
        setSize (500,400);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        panel.setLayout(new BorderLayout());
        blue = new JButton ("Blue");
        Dimension d = new Dimension ();
        d.height = 40;
        d.width = 100;
        blue.setPreferredSize (d);
        blue.addActionListener (new listener_button_blue ());
        green = new JButton ("Green");
        d.height = 40;
        d.width = 100;
        green.setPreferredSize (d);
        green.addActionListener (new listener_button_green ());
        yellow = new JButton ("Yellow");
        d.height = 40;
        d.width = 100;
        yellow.setPreferredSize (d);
        yellow.addActionListener (new listener_button_yellow ());
        pink = new JButton ("Pink");
        d.height = 40;
        d.width = 100;
        pink.setPreferredSize (d);
        pink.addActionListener (new listener_button_pink ());
        
        panel.add (blue, BorderLayout.SOUTH);
        panel.add (green, BorderLayout.NORTH);
        panel.add (yellow, BorderLayout.EAST);
        panel.add (pink, BorderLayout.WEST);
        add (panel);
        panel.setBackground (Color.red);
    }
    // class to listen to button events
    class listener_button_blue implements ActionListener {
        public void actionPerformed (ActionEvent e) {
        panel.setBackground (Color.blue);

        }
    }
    class listener_button_green implements ActionListener {
        public void actionPerformed (ActionEvent e) {
        panel.setBackground (Color.green);

        }
    }
     class listener_button_yellow implements ActionListener {
        public void actionPerformed (ActionEvent e) {
        panel.setBackground (Color.yellow);

        }
    }
    class listener_button_pink implements ActionListener {
        public void actionPerformed (ActionEvent e) {
        panel.setBackground (Color.pink);

        }
    }
}

