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
//declaro las variables estaticas para poder usarlas en las pantallas
    private static String mensaje;
    
 // declaro intentos para poder contar los intentos
    private int Intentos=1;
    
    
    public static String getMensaje() {
        return mensaje;
    }

    //Metodo que convierte el String que se ingreso en Int y llama a la funcion comparar.
    public void Traspaso(String texto) {

        int valor;
       
        
        // capturamos la excepcion en el caso que no ingrese numeros
        try {

            valor = Integer.parseInt(texto);

            //si es numero verificamos que este entre 0 y 100 y llamamos a la funcion comparar
            
            if (valor >= 0 && valor <= 100) {
                Juego.txtPersona.append("Intento:"+Intentos +"    "+ texto+"  "+ Comparar(valor)+"\n");
                                
            } else {
                
                mensaje = texto + "   no esta entre 0 y 100";
                //muestra el mensaje por pantalla
                Mensajes mens = new Mensajes();
                mens.setVisible(true);
            }

        } catch (NumberFormatException e) {
            mensaje = texto + "  no es un numero";
            // muestra el mensaje por pantalla
            Mensajes mens = new Mensajes();
            mens.setVisible(true);
           
        }
       
      
    }
 //Metodo que compara si es menor o mator el numero aletorio al ingresado.
    
    public String Comparar(int hum) {
        //aumenta el acumulador de intentos
        Intentos = Intentos + 1;
        
        System.out.println(Main.numComputadora);
        if (Main.numComputadora > hum)
        {
            return "es menor que el numero a adivinar";
        } 
        else if (Main.numComputadora < hum) 
        {
            return "es mayor que el numero a adivinar";
        }
        Juego.jButton1.setEnabled(false);
        return "\n Ganaste fiera,tifon,torbellino,maquina,crack" + "\n" + "En tu intento  " + Intentos;

    }

}
