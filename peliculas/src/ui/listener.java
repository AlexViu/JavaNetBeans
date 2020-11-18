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
import javax.swing.*;

/**
 *
 * @author aledom
 */
public class listener implements ActionListener {
    private JTextField id, idSearch;
    private JTextArea titulo;
    private JButton backwards, forward, search, all;
    private List <pelicula> peliculas;
    private int position;
    
    public listener (JTextField id, JTextArea titulos, JTextField idSearch, JButton backwards, JButton forward, JButton search, JButton all) {
        this.id = id;
        this.titulo = titulos;
        this.idSearch = idSearch;
        this.backwards = backwards;
        this.forward = forward;
        this.search = search;
        this.all = all;
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
                peliculaDAO ClientDAO = new peliculaDAO();
                int id_text = Integer.parseInt(idSearch.getText());
                p.setId(id_text);
                p = ClientDAO.findById(with, p);
                Connection_DB.CloseConnection(with);
            } catch (Exception ex) {
                ex.printStackTrace(); 
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
            update (p); 
        }
       private void update (pelicula p) {
           String id_text = Integer.toString(p.getId());
            this.id.setText(id_text);
            this.titulo.setText (p.getTitulo()); 
       }
}
