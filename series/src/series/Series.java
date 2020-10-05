/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import model.access;
import model.listShow;
import model.show;
import view.frame;
/**
 *
 * @author aledom
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frame f = new frame();
        f.setVisible(true);
        
       // show sh=new show("Breaking Bad", "Vicent Guilligan", 5,"Drama", 5);
        //listShow ls = new listShow();
        //ls.setShow(sh);
        //sh= new show("Game of thrones", "David Benioff", 6,"1", 6);
        //ls.setShow(sh);
        //access.saveLS(ls);
        //System.out.print("Saved series");
        
        //listShow ls = new listShow();
        //ls=access.loadLS();
        //show sh=new show();
        //sh=ls.getShow(0);
        //System.out.print("Title:");
        //System.out.println(sh.getTitle());

        //sh=ls.getShow(1);
        //System.out.print("Title:");
        //System.out.println(sh.getTitle());        
    }
    
}
