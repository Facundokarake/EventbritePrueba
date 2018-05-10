/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeNumeros;

import JuegoDeNumeros.Pantallas.Compuadivina;

/**
 *
 * @author SISTEMAS
 */
public class ComparadorCompuAdivina {
    int varMax=100;
    int varMenor = 0;
    private int numCompu = (int) (Math.random() * 100 + 1);

    public int getNumCompu() {
        return numCompu;
    }

    public void setNumCompu(int numCompu) {
        this.numCompu = numCompu;
    }
      
    public void mas (){
        
        
        System.out.println(numCompu);
       if (varMax >= numCompu){
            varMax=numCompu;}
         
                numCompu=(int) (Math.random()*(varMax-varMenor)+(varMenor));
         Compuadivina.txtCompu.append("asi que mas chico entonces es "+numCompu+"\n");
          System.out.println("var mayor: "+varMax);
        }
    
    public void menos (){
        
              
        if (varMenor <= numCompu){
            varMenor=numCompu;}
        
               
         numCompu=(int) (Math.random()*(varMax-varMenor)+(varMenor));
         Compuadivina.txtCompu.append("asi que mas grande entonces es "+numCompu+"\n");
         System.out.println("var menor: "+varMenor);
        }
    
}

