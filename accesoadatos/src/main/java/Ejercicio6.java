/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aledom
 */
public class Ejercicio6 {
    public static void main (String [] args) {
    
        int [][] vendedores = new int[18][10];
        int total = 0;
        
        for (int i = 0; i < 18; i++){
            for(int n = 0; n < 10; n++) {
                
                int num_random = (int) (Math.random()*50);
                
                total = total + num_random;
                vendedores[i][n] = num_random;
                
                System.out.print(vendedores[i][n] + " ");
                
            }
            System.out.print("\n");
        }
    
        System.out.println("Numero de ventas totales: " + total);
        
    }
}
