/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aledom
 */
public class alumno {
    public String Nombre;
    public String Apellidos;
    public String Dni;
    public String Nota_letra;
    public int Nota_num;
    
    public alumno(String nombre, String apellidos, String dni, String nota_letra, int nota_num) {
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Dni = dni;
        this.Nota_letra = nota_letra;
        this.Nota_num = nota_num;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNota_letra() {
        return Nota_letra;
    }

    public void setNota_letra(String Nota_letra) {
        this.Nota_letra = Nota_letra;
    }

    public int getNota_num() {
        return Nota_num;
    }

    public void setNota_num(int Nota_num) {
        this.Nota_num = Nota_num;
    }
    
    public void imprimirAlumno() {
	
	System.out.println("- Nombre: " + this.Nombre);
        System.out.println("- Apellidos:  " + this.Apellidos);
        System.out.println("- DNI: " + this.Dni);
        System.out.println("- Nota: " + this.Nota_num + " - " + this.Nota_letra);
        System.out.println("------------------------");
    }
}
