/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable;

import com.mysql.jdbc.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aledom
 */
public class Tablamysql extends JFrame {
    JTable tabla1;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Tablamysql() {
        setTitle("Clientes");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tabla1 = new JTable();
        tabla1.setModel(modelo);
        
        Object[] tags = new Object [2];
        tags [0] = "Id";
        tags [1] = "Notes";
        modelo.setColumnIdentifiers(labels);
        add(tabla1);
    }
    
    // connection to the database
    
    
 String urlOdbc = "jdbc:mysql://localhost:3306/di?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
 Connection con = (java.sql.DriverManager.getConnection(urlOdbc, "root", "123456"));
 // We prepare the query 
 Statement s = con.createStatement (); 
 ResultSet rs = s.executeQuery ("select * from clients");
  // We go through the result, while there are records to read
 // add each record to the DefaultDataModel
 int rowNumber = 0;
 while (rs.next ()) 
 { 
 // The row for the table model is created and filled.
 Object [] rowData = new Object [modelo.getColumnCount ()];
 rowData [0] = rs.getObject (1);
 rowData [1] = rs.getObject (2);
 modelo.addRow (rowData);
 rowNumber ++; 
 } 
 // We close the connection to the database. 
 rs.close ();
 s.close ();
 con.close ();
}
