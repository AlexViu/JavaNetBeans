/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import java.util.*;

/**
 *
 * @author aledom
 */
public class peliculaDAO {
     public pelicula findById (Connection to, pelicula pel) throws Exception {
        pelicula p = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try { 
            stmt = to.prepareStatement ("SELECT * FROM pelicula WHERE id =?");
            stmt.setInt (1, pel.getId());
            rs = stmt.executeQuery ();
            while (rs.next ()) {
                p = new pelicula ();
                getPeliculaRow (rs, p); 
            } 
        } catch (SQLException ex) {
        ex.printStackTrace ();
        throw new Exception ("There was a problem searching the client by DNI" + ex.getMessage ());
        } finally {
            if (rs != null) rs.close (); // We close the result
            if (stmt != null) stmt.close (); // We close the Statement 
        }
            return p;
    }
     
     private void getPeliculaRow(ResultSet rs, pelicula pel) throws SQLException {
        pel.setId (rs.getInt ("id"));
        pel.setTitulo (rs.getString ("titulo"));
    
    }
      public List <pelicula> findAll (Connection con) throws Exception {
        List <pelicula> listPeliculas = new ArrayList ();
        Statement st = null;
        ResultSet rs = null; 
        try {
            st = con.createStatement ();
             rs = st.executeQuery ("Select * from clients"); 
            pelicula pel = null;
            while (rs.next ()) {
                pel = new pelicula ();
                getPeliculaRow (rs, pel); 
                listPeliculas.add (pel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace ();
            throw new Exception ("There was a problem searching the client " + ex.getMessage ());
        } 
        finally {
            if (rs != null) rs.close (); // We close the result
            if (st != null) st.close (); // We close the Statement 
        }
        return listPeliculas;
    }
     
}
