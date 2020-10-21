/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import DAO.ClientDAO;
import DAO.Connection_DB;
import DAO.client;
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
    private JTextArea notes;
    private JButton backwards, forward, search, all;
    private List <client> clients;
    private int position;
    
    public listener (JTextField id, JTextArea notes, JTextField idSearch, JButton backwards, JButton forward, JButton search, JButton all) {
        this.id = id;
        this.notes = notes;
        this.idSearch = idSearch;
        this.backwards = backwards;
        this.forward = forward;
        this.search = search;
        this.all = all;
        position = 0; 
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        client c = new client();
        
        if (e.getSource() == this.search) {
            forward.setEnabled (false);
            backwards.setEnabled (false);
            
            try {
                Connection_DB Connection_DB = new Connection_DB();
                Connection with = Connection_DB.OpenConnection();
                ClientDAO ClientDAO = new ClientDAO();
                c.setId(idSearch.getText());
                c = ClientDAO.findById(with, c);
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
                ClientDAO ClientDAO = new ClientDAO();
                clients = ClientDAO.findAll(with);
                Connection_DB.CloseConnection(with); 
                position = 0;
                c = clients.get(position);
            } catch (Exception ex){
                ex.printStackTrace (); 
            }
        }
        
        if (e.getSource() == this.forward) {
            position++;
        
            if (position == clients.size()) {
                position--;
            }
            c = clients.get(position);
        }
        
        if (e.getSource () == this.backwards ) {
            if (position> 0) {
            position--;
            }
            c = clients.get (position);
            }
            update (c); 
        }
       private void update (client c) {
            this.id.setText (c.getId ());
            this.notes.setText (c.getNotes()); 
       }
    }
