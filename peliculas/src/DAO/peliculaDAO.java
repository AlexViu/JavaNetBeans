/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

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
            throw new Exception (ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally {
            if (rs != null) rs.close (); // We close the result
            if (stmt != null) stmt.close (); // We close the Statement 
        }
        return p;
    }
     
     private void getPeliculaRow(ResultSet rs, pelicula pel) throws SQLException {
        pel.setId (rs.getInt ("id"));
        pel.setTitulo (rs.getString ("titulo"));
        pel.setDirector(rs.getString ("director"));
        pel.setGenero(rs.getString ("genero"));

    }
      public List <pelicula> findAll (Connection con) throws Exception {
        List <pelicula> listPeliculas = new ArrayList ();
        Statement st = null;
        ResultSet rs = null; 
        try {
            st = con.createStatement ();
             rs = st.executeQuery ("Select * from pelicula"); 
            pelicula pel = null;
            while (rs.next ()) {
                pel = new pelicula ();
                getPeliculaRow (rs, pel); 
                listPeliculas.add (pel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace ();
            throw new Exception (ex.getMessage());
        } 
        finally {
            if (rs != null) rs.close (); // We close the result
            if (st != null) st.close (); // We close the Statement 
        }
        return listPeliculas;
    }
     
      public pelicula insert (Connection to, pelicula pel) throws Exception {
        pelicula p = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registros = 0;
        try { 
            stmt = to.prepareStatement("INSERT INTO pelicula(titulo, director, genero) VALUES (?,?,?)");
            
            stmt.setString (1, pel.getTitulo());
            stmt.setString (2, pel.getDirector());
            stmt.setString (3, pel.getGenero());
            registros = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        throw new Exception (ex.getMessage());
        } finally {
            if (rs != null) rs.close (); // We close the result
            if (stmt != null) stmt.close (); // We close the Statement 
        }
            return p;
    }
      
      public pelicula delete (Connection to, pelicula pel) throws Exception {
        pelicula p = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registros = 0;
        try { 
            stmt = to.prepareStatement("DELETE FROM pelicula where id = ?");
            stmt.setInt (1, pel.getId());
            registros = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        throw new Exception (ex.getMessage());
        } finally {
            if (rs != null) rs.close (); // We close the result
            if (stmt != null) stmt.close (); // We close the Statement 
        }
            return p;
    }
      
      public pelicula updatep (Connection to, pelicula pel) throws Exception {
        pelicula p = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registros = 0;
        try { 
            stmt = to.prepareStatement("UPDATE pelicula SET titulo = ?, director = ?, genero = ? WHERE id = ?");
            stmt.setString (1, pel.getTitulo());
            stmt.setString (2, pel.getDirector());
            stmt.setString (3, pel.getGenero());
            stmt.setInt (4, pel.getId());
            registros = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        throw new Exception (ex.getMessage());
        } finally {
            if (rs != null) rs.close (); // We close the result
            if (stmt != null) stmt.close (); // We close the Statement 
        }
            return p;
    }
}
