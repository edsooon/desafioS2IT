/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desafios2it.bean;

import br.com.desafios2it.domain.binaryTree;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emello
 */
public class BinaryTreeBean {

    List<binaryTree> binaryTreeList = new ArrayList<>();

    public String somaDosNosSubsequentesDoNo(binaryTree raizParam) {
        
        if (raizParam == null) {
            //Caso a raízParam for nula retornará a mensagem abaixo
            return "A árvore está vazia!";
        }

        //Caso a raízParam não for nula adiciona na list binaryTreeList para poder iniciar o for
        binaryTreeList.add(raizParam);
        
        //Seta o valor 0 na variável somaTotalNosSubs, que será o retorno para o usuário dos nós subsequentes 
        int somaTotalNosSubs = 0;

        //A lista torna-se crescente, conforme o left ou right do nó atual for diferente de nullo os mesmo são adiconados na lista
        for (int i = 0; i < binaryTreeList.size(); i++) {
            
            //Como o primeiro nó será o nó raiz parametizado pelo usuário ele não será contado, somente os subsequentes 
            if(raizParam != binaryTreeList.get(i)){              
              somaTotalNosSubs += binaryTreeList.get(i).getValor();  
            }
            
            //Caso o nó left(esquerdo) for diferente de nulo será adicionado a lista binaryTreeList
            if (binaryTreeList.get(i).getLeft() != null) {
                binaryTreeList.add(binaryTreeList.get(i).getLeft());
            }
            
            //Caso o nó left(direito) for diferente de nulo será adicionado a lista binaryTreeList
            if (binaryTreeList.get(i).getRight() != null) {
                binaryTreeList.add(binaryTreeList.get(i).getRight());
            }
            
            
            
        }
        
        return ("A soma dos nós subsequentes do nó de valor " + raizParam.valor + " é: " + somaTotalNosSubs);
    }

   

}
