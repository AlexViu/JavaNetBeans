
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
public class Ejercicio3 {
     public static void main (String [] args) {
          Scanner sc = new Scanner(System.in);
          
          int a;
          
          System.out.println("Escribe un numero");
          a = sc.nextInt();
          
          for ( int i = 1; i <= a; i++) {
              if (a % i == 0) {
                  System.out.println(i);
              }
          }
          
     }
}
