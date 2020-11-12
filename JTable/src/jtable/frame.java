/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author aledom
 */
public class frame  extends JFrame {
    
    JTable jTabla1;
    JScrollPane jScrollPanel1;
    public frame() {
        // Headers for the columns of the table
         String [] headers = new String []
         {
         "Name", "Address", "Telephone", "Car?"
         };

        // Data for the table
         Object [] [] data = new Object [] []
         {
         {"Alfons González Pi", "Argentona, Barcelona", new Long (933333333), true},
         {"Ana María Cuesta Suñer", "Gijón, Asturias", new Long (984454545), false},
         {"Elena Veiguela Suárez", "Pontevedra", new Long (986678678), false},
         {"Pedro Aguado Rodríguez", "Madrid", new Long (912804574), true}
         };


         jTabla1 = new JTable();
         
         jTabla1.setModel(new DefaultTableModel(data, headers)
         {
             Class [] tipoColumna = {String.class, String.class, Long.class,Boolean.class };
             
            @Override
            public Class getColumnClass (int indColum) {
                return tipoColumna [indColum];
            }
         });
         jScrollPanel1 = new JScrollPane(jTabla1);
         
         add(jScrollPanel1);
    }
}
