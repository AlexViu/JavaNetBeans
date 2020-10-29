/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aledom
 */
public class all {
     public static ArrayList<client> obtainData(){
        ArrayList<client> lc=new ArrayList();
        // Establecemos la conexión con la base de datos.
        try {
             String urlOdbc = "jdbc:mysql://localhost:3306/di?useSSL=false";
            
            Connection   con=(java.sql.DriverManager.getConnection(urlOdbc,"root","123456"));
            // Preparamos la consulta 
            Statement s = con.createStatement(); 
            ResultSet rs = s.executeQuery ("select * from clients");
            // Recorremos el resultado, mientras haya registros para leer 
            while (rs.next()) 
            { 
                client c = new client();
                c.setId(rs.getString("id"));
                c.setNotes(rs.getString("notes"));
                lc.add(c);
            }               
            // Cerramos la conexion a la base de datos. 
            rs.close();
            s.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error in database");
        }
        return lc;
    }
}
