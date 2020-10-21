/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;

/**
 *
 * @author aledom
 */
public class Connection_DB {
    public Connection OpenConnection () throws Exception {
        Connection con = null; 
    
        try {
            String url="jdbc:mysql://localhost:3306/di?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";


            con = (java.sql.DriverManager.getConnection (url, "root", "123456")); 
            return con;
            
        } catch (Exception e){
            e.printStackTrace ();
            throw new Exception ("Connection could not be established" + e.getMessage ());
        }
    }
    public void CloseConnection(Connection con) throws Exception {

        try {
            if(con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();

            throw new Exception ("It was impossible to close the connection" + e.getMessage ());
        }
    }
} 


