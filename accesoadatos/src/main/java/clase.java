
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aledom
 */
public class clase {
    ArrayList <alumno> Alumnos = new ArrayList<alumno>();
    
    public clase(ArrayList alumnos) {
    
       this.Alumnos = alumnos;
    }

    public ArrayList<alumno> getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(ArrayList<alumno> Alumnos) {
        this.Alumnos = Alumnos;
    }
    
}
