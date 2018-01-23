/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafios2it;

import br.com.desafios2it.bean.BinaryTreeBean;
import br.com.desafios2it.bean.ElementosBean;
import br.com.desafios2it.domain.binaryTree;
import br.com.desafios2it.domain.elementos;

/**
 *
 * @author Emello
 */
public class DesafioS2IT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Início do Exercício 8 Gerar C

        elementos elemen = new elementos();
        elemen.setA(75);
        elemen.setB(1256);
        ElementosBean elemenBean = new ElementosBean();

        if (elemen.getA() != null && elemen.getB() != null) {
            //Elemento C recebe valor retornado do método gerarC que está no pacote Bean na classe elemenBean
            elemen.setC(Integer.valueOf(elemenBean.gerarC(elemen)));

            //Verifica se o elemento C é maior que 1000000, caso for elemento C recebe -1 senão, receberá o valor dele mesmo
            elemen.setC(elemen.getC() > 1000000 ? -1 : elemen.getC());

            System.out.println("\n Exercício 8 - " + "O valor do elemento C é " + elemen.getC());

        } else {
            System.out.println("\n Exercício 8 - " + "Os elementos A e B não podem serem nulos!");
        }
        
        //Fim do Exercício 8
        

        
        //Início do Exercício 9 Somar valores subsequentes de um determinado nó
        
        
        //Poderia também criar e utilizar um método construtor para setar os valores de cada objeto        
        binaryTree A = new binaryTree();
        A.setValor(15);

        binaryTree B = new binaryTree();
        B.setValor(10);

        binaryTree C = new binaryTree();
        C.setValor(20);

        binaryTree D = new binaryTree();
        D.setValor(8);

        binaryTree E = new binaryTree();
        E.setValor(12);

        binaryTree F = new binaryTree();
        F.setValor(16);

        binaryTree G = new binaryTree();
        G.setValor(25);
        
        binaryTree H = new binaryTree();
        H.setValor(6);

        binaryTree I = new binaryTree();
        I.setValor(9);
      

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        D.left = H;
        D.right = I;
        

        BinaryTreeBean binaryBean = new BinaryTreeBean();
        //Após instanciar a classe BinaryTreeBean chamamos o método somaDosNosSubsequentesDoNo passando o nó que deverá ser somados os nós subsequentes do mesmo.
        System.out.println("\n Exercício 9 - " + binaryBean.somaDosNosSubsequentesDoNo(D));

    }

}
