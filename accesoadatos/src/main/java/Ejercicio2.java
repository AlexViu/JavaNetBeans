
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aledom
 */
public class Ejercicio2 {
     public static void main (String [] args) {
          Scanner sc = new Scanner(System.in);
          
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          
          if (a + b > c && a + c > b && b + c > a) {
              System.out.println("Es un triangulo");
          } else {
              System.out.println("No es un triangulo");
          }

     }
}
