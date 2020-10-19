/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author aledom
 */
public class listShow implements Serializable {
    private ArrayList<show> seriesList;
    
    public listShow() {
        seriesList = new ArrayList<>();
    }
    
    public show getShow(int p) {
        return seriesList.get(p);
    }
    
    public void setShow(show s) {
        seriesList.add(s);
    }
    public int longitud() {
        return seriesList.size();
    }

    public void deleteShow(int p) {
        seriesList.remove(p);
    }
    
    public void update(show s, int p){
        seriesList.get(p).setTitle(s.getTitle());
        seriesList.get(p).setScriptwriter(s.getScriptwriter());
        seriesList.get(p).setSeasons(s.getSeasons());
        seriesList.get(p).setGenre(s.getGenre());
        seriesList.get(p).setViews(s.getViews());
        seriesList.get(p).setPlatform(s.getPlatform());
    }
}
