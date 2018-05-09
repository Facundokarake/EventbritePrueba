/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeNumeros;

/**
 *
 * @author SISTEMAS
 */
public class ComparadorCompuAdivina {
    
    private static int numCompu = (int) (Math.random() * 100 + 1);

       
    public static int getNumCompu() {
        return numCompu;
    }

    public static void setNumCompu(int numCompu) {
        ComparadorCompuAdivina.numCompu = numCompu;
    }

    public void mas (){
        numCompu=(int) (Math.random()*(100+1));
        System.out.println(numCompu);
    }
    
    
    
    
}
