/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aledom
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String tconductor;
        double porcentaje;
        
        System.out.println("Tipo de conductor");
        tconductor = sc.nextLine();
        System.out.println("porcentaje de alcohol");
        porcentaje = sc.nextDouble();
        
        if ((tconductor.equals("autobus") || tconductor.equals("taxi") || tconductor.equals("ambulancia")) && porcentaje < 0.3) {
            System.out.println("Puedes conducir");
        }
        
         if ((tconductor.equals("autobus") || tconductor.equals("taxi") || tconductor.equals("ambulancia")) && porcentaje >= 0.3) {
            System.out.println("No puedes conducir");
        }
        
        if ((tconductor.equals("conductor") || tconductor.equals("ciclista")) && porcentaje < 0.5) {
            System.out.println("Puedes conducir");
        }
        
        if ((tconductor.equals("conductor") || tconductor.equals("ciclista")) && porcentaje >= 0.5) {
            System.out.println("No puedes conducir");
        }
    }
}
