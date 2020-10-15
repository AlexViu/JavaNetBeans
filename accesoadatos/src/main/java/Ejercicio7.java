
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aledom
 */
public class Ejercicio7 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <alumno> listaAlumnos = new ArrayList<alumno>();
        
        int opcion;
        
        String Nombre;
        String Apellidos;
        String Dni;
        String Nota_letra = "";
        int Nota_num;
        
        System.out.println("1- Estudiante nuevo");
        System.out.println("2- Eliminar estudiante");
        System.out.println("3- Modificar notas");
        System.out.println("4- Mostrar todas las notas");
        System.out.println("5- Mostrar porcentaje de aprobados");
        System.out.println("------------------------");
        
        opcion = sc.nextInt();
        sc.nextLine();
        
        while (opcion != 9) {
            switch(opcion) {
                case 1:
                    System.out.println("Cual es su nombre: ");
                    Nombre = sc.nextLine();
                    System.out.println("Cual es su apellido: ");
                    Apellidos = sc.nextLine();
                    System.out.println("Cual es su dni: ");
                    Dni = sc.nextLine();
                    System.out.println("Cual es su nota: ");
                    Nota_num = sc.nextInt();
                    sc.nextLine();

                    if (Nota_num < 0) {
                        Nota_letra = "No presentado";
                    }
                    if (Nota_num >= 0 && Nota_num < 5) {
                        Nota_letra = "Suspendido";
                    }
                    if (Nota_num >= 5 && Nota_num < 7) {
                        Nota_letra = "Aprovado";
                    }
                    if (Nota_num >= 7 && Nota_num < 9) {
                        Nota_letra = "Notable";
                    }
                    if (Nota_num >= 9 && Nota_num < 10) {
                        Nota_letra = "Sobresaliente";
                    }
                    if (Nota_num == 10) {
                        Nota_letra = "M.Honor";
                    }

                    alumno a = new alumno(Nombre, Apellidos, Dni, Nota_letra, Nota_num);
                    listaAlumnos.add(a);
                case 2:
                    
                case 3:
                    
                case 4:
                    Iterator<alumno> it = listaAlumnos.iterator();
                    alumno alu;
                    while (it.hasNext()) {
                        alu = (alumno)(it.next());
                        alu.imprimirAlumno();
                    }
                case 5:
            }//Fin switch
            
            System.out.println("1- Estudiante nuevo");
            System.out.println("2- Eliminar estudiante");
            System.out.println("3- Modificar notas");
            System.out.println("4- Mostrar todas las notas");
            System.out.println("5- Mostrar porcentaje de aprobados");
            System.out.println("------------------------");

            opcion = sc.nextInt();
            sc.nextLine();
            
        } //Fin while
 
    }
    
    
}
