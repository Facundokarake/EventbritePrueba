/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeNumeros;

import JuegoDeNumeros.Pantallas.*;


/**
 *
 * @author SISTEMAS
 */
public class Comparador {
    
    
  
    Felicitaciones feli = new Felicitaciones();
    
    public String Comparar (int hum){
           Main.Intentos = Main.Intentos+1;
         System.out.println("comparando");
    if  (Main.numComputadora>hum)return"mmm intenta con uno mas grande";
     else if (Main.numComputadora<hum) return "te pasaste machote";
               
        return "Ganaste fiera,tifon,torbellino,maquina,crack,numero 1";
              
}

}    
