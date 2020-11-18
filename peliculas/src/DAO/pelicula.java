/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author aledom
 */
public class pelicula {
    private int Id;
    private String Titulo;
    private String Director;
    private String Genero;

    public pelicula() {
       
    }
    
    public pelicula(int id) {
        this.Id = id;
    }
    
    public pelicula(String titulo, String director, String genero) {
        this.Titulo = titulo;
        this.Director = director;
        this.Genero = genero;
    }
    
    public pelicula(int id, String titulo, String director, String genero) {
        this.Id = id;
        this.Titulo = titulo;
        this.Director = director;
        this.Genero = genero;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        this.Genero = genero;
    }
    
    
}
