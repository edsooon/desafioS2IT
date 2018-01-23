/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios2it.bean;

import br.com.desafios2it.domain.elementos;

/**
 *
 * @author Emello
 */
public class ElementosBean {

    public String gerarC(elementos elementoAeB) {
        
         String elementoC = "";
        try {
            
            //Compara os 2 elementos e popula a variável com a quantidade do elemento que tem a maior quantidade de caracteres
            //Caso a quantidade de caracteres de ambos forem iguais, retornará a quantidade do elementoAeB.getA().toString()
            int elementoMaiorCaracteres = elementoAeB.getA().toString().length() >= elementoAeB.getB().toString().length() ?  elementoAeB.getA().toString().length() : elementoAeB.getB().toString().length() ;
         
            //Percorre de zero até o valor da variável elementoMaior
            for (int i = 0; i <= elementoMaiorCaracteres; i++) {
               
               //Caso i for menor que a quantidade de caracteres do objeto elementoAeB.getA().toString(), concatena
               //elementoC com posição do char atual de elementoAeB.getA().toString(), caso seja maior, não pegará mais nada do elementoAeB.getA().toString() 
               if (i < elementoAeB.getA().toString().length()) {
    	    	elementoC = elementoC + elementoAeB.getA().toString().charAt(i);
        	}
               
               //Caso i for menor que a quantidade de caracteres do objeto elementoAeB.getB().toString(), concatena
               //elementoC com posição do char atual de elementoAeB.getB().toString(), caso seja maior, não pegará mais nada do elementoAeB.getB().toString() 
        	if (i < elementoAeB.getB().toString().length()) {
    	    	elementoC = elementoC + elementoAeB.getB().toString().charAt(i);
        	}         

            }

        } catch (Exception e) {

        }

        return elementoC;
    }

}
