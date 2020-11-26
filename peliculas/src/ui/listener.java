/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import DAO.peliculaDAO;
import DAO.Connection_DB;
import DAO.pelicula;
import java.awt.event.*;
import java.sql.*;
import java.util.List;
import javax.crypto.interfaces.PBEKey;
import javax.swing.*;

/**
 *
 * @author aledom
 */
public class listener implements ActionListener {
    private JTextField id, idSearch, titulo, genero, director;
    private JButton backwards, forward, search, all, nuevo, edit, add_pel,delete, updatep;
    private List <pelicula> peliculas;
    private int position;
    
    public listener (JTextField id, JTextField titulos, JTextField director, JTextField genero, JTextField idSearch, JButton backwards, JButton forward, JButton search, JButton all, JButton nuevo, JButton edit, JButton add_pel, JButton delete,JButton updatep) {
        this.id = id;
        this.titulo = titulos;
        this.genero = genero;
        this.director = director;
        this.idSearch = idSearch;
        this.backwards = backwards;
        this.forward = forward;
        this.search = search;
        this.all = all;
        this.nuevo = nuevo;
        this.edit = edit;
        this.add_pel = add_pel;
        this.delete = delete;
        this.updatep = updatep;
        position =0; 
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        pelicula p = new pelicula();
        
        if (e.getSource() == this.search) {
            forward.setEnabled (false);
            backwards.setEnabled (false);
            
                try {
                    Connection_DB Connection_DB = new Connection_DB();
                    Connection with = Connection_DB.OpenConnection();
                    peliculaDAO PeliculaDAO = new peliculaDAO();
                    int id_text = Integer.parseInt(idSearch.getText());
                    p.setId(id_text);
                    p = PeliculaDAO.findById(with, p);
                    Connection_DB.CloseConnection(with);
                    if(p == null) {
                       throw new Exception ("No results");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    return;
                }
        }
        
        if (e.getSource() == this.all) {
            forward.setEnabled (true);
            backwards.setEnabled (true);
            position = 0;
            
            try {
                Connection_DB Connection_DB = new Connection_DB();
                Connection with = Connection_DB.OpenConnection();
                peliculaDAO peliculaDAO = new peliculaDAO();
                peliculas = peliculaDAO.findAll(with);
                Connection_DB.CloseConnection(with); 
                position = 0;
                p = peliculas.get(position);
            } catch (Exception ex){
                ex.printStackTrace (); 
            }
        }
        
        if (e.getSource() == this.forward) {
            position++;
        
            if (position == peliculas.size()) {
                position--;
            }
            p = peliculas.get(position);
        }
        
        if (e.getSource () == this.backwards ) {
            if (position> 0) {
            position--;
            }
            p = peliculas.get (position);
            }

        if (e.getSource() == this.nuevo) {
            forward.setEnabled (false);
            backwards.setEnabled (false);
            add_pel.setVisible(true);
            nuevo.setVisible(false);
            titulo.setEditable(true);
            director.setEditable(true);
            genero.setEditable(true);
            edit.setEnabled(false);
            delete.setEnabled(false);

        }
        
        if(e.getSource() == this.add_pel){
            try {
                Connection_DB Connection_DB = new Connection_DB();
                Connection with = Connection_DB.OpenConnection();
                peliculaDAO PeliculaDAO = new peliculaDAO();
                pelicula pe = new pelicula(this.titulo.getText(),this.director.getText(), this.genero.getText());
                pe = PeliculaDAO.insert(with, pe);
                Connection_DB.CloseConnection(with);
            } catch (Exception ex) {
                ex.printStackTrace(); 
            }
            add_pel.setVisible(false);
            nuevo.setVisible(true);
            titulo.setEditable(false);
            director.setEditable(false);
            genero.setEditable(false);
            edit.setEnabled(true);
            delete.setEnabled(true);
        }
        
        if(e.getSource() == this.delete){
            try {
                Connection_DB Connection_DB = new Connection_DB();
                Connection with = Connection_DB.OpenConnection();
                peliculaDAO PeliculaDAO = new peliculaDAO();
                int del_id = Integer.parseInt(this.id.getText());
                pelicula pe = new pelicula(del_id);
                pe = PeliculaDAO.delete(with, pe);
                Connection_DB.CloseConnection(with);
            } catch (Exception ex) {
                ex.printStackTrace(); 
            }   
        }

        if(e.getSource() == this.edit){
           
            try {
                    Connection_DB Connection_DB = new Connection_DB();
                    Connection with = Connection_DB.OpenConnection();
                    peliculaDAO PeliculaDAO = new peliculaDAO();
                    int id_text = Integer.parseInt(id.getText());
                    p.setId(id_text);
                    p = PeliculaDAO.findById(with, p);
                    Connection_DB.CloseConnection(with);
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Select a movie to edit");
                }
            
           updatep.setVisible(true);
           edit.setVisible(false);
           id.setEditable(true);
           titulo.setEditable(true);
           director.setEditable(true);
           genero.setEditable(true);
           nuevo.setEnabled(false);
           delete.setEnabled(false);
        }
        
        if(e.getSource() == this.updatep){
            try {
                Connection_DB Connection_DB = new Connection_DB();
                Connection with = Connection_DB.OpenConnection();
                peliculaDAO PeliculaDAO = new peliculaDAO();
                int del_id = Integer.parseInt(this.id.getText());
                pelicula pe = new pelicula(del_id, this.titulo.getText(),this.director.getText(), this.genero.getText());
                pe = PeliculaDAO.updatep(with, pe);
                Connection_DB.CloseConnection(with);
            } catch (Exception ex) {
                ex.printStackTrace(); 
            }
            updatep.setVisible(false);
            edit.setVisible(true);
            id.setEditable(false);
            titulo.setEditable(false);
            director.setEditable(false);
            genero.setEditable(false);
            nuevo.setEnabled(true);
            delete.setEnabled(true);
           }
            update (p); 
        }
 
       private void update (pelicula p) {
           String id_text = Integer.toString(p.getId());
           this.id.setText(id_text);
           this.titulo.setText (p.getTitulo());
           this.director.setText (p.getDirector());
           this.genero.setText (p.getGenero());
           
       }
}
