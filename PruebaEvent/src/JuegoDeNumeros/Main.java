/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeNumeros;

import JuegoDeNumeros.Pantallas.Juego;

/**
 *
 * @author SISTEMAS
 */
public class Main {

    public static int AcumuladorError=0;
    public static int Intentos=0;
public static int numComputadora = (int) (Math.random() * 100 + 1); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
Juego fa = new Juego(); 
fa.setVisible(true); 
            System.out.println(fa);
      
            
    }

  
    
}
