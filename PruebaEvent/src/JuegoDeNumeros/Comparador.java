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
    
    
  private static String mensaje;
  private static int Intentos;

    public static int getIntentos() {
        return Intentos;
    }

    public static void setIntentos(int Intentos) {
        Comparador.Intentos = Intentos;
    }

 
    public static String getMensaje() {
        return mensaje;
    }

   
     public void Traspaso (String texto){
   
         
        int valor;
    
        try {
            
       valor = Integer.parseInt(texto);
       
   if (valor>=0 && valor<=100){       
       mensaje = Comparar(valor);
       Mensajes mens = new Mensajes();
       mens.setVisible(true);
   }
   
   else{ 
       mensaje="tiene que ingresar numero de 0 a 100";
       Mensajes mens = new Mensajes();
       mens.setVisible(true);}       
   
}
        
catch (NumberFormatException e) {
   mensaje="Solo puede ingresar numeros";
   Mensajes mens = new Mensajes();
     mens.setVisible(true);
     
  }         
    }
    
    public String Comparar (int hum){
           Intentos = Intentos+1;
         System.out.println("comparando");
    if  (Main.numComputadora>hum)return"mmm intenta con uno mas grande";
     else if (Main.numComputadora<hum) return "te pasaste machote, es mas chico";
               
        return "Ganaste fiera,tifon,torbellino,maquina,crack,numero 1"+"" + "Ganaste en tu intento" +""+ Intentos;
              
}

    
    
}    
