/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author aledom
 */
public class show implements Serializable{
    
    private String title;
    private String scriptwriter;
    private String genre;
    private String platform;
    private int views;
    private int seasons;

    public show() {
        this.title = "";
        this.scriptwriter = "";
        this.seasons = 0;
        this.genre = "";
        this.views = 0;
        this.platform = "";
    }
    
    public show(String title, String scriptwriter, int seasons, String genre, int views, String plat) {
        this.title = title;
        this.scriptwriter = scriptwriter;
        this.seasons = seasons;
        this.genre = genre;
        this.views = views;
        this.platform = plat;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getScriptwriter() {
        return scriptwriter;
    }

    public void setScriptwriter(String scriptwriter) {
        this.scriptwriter = scriptwriter;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    
}