/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabioalvaro
 */
public class TestaEscopo {

    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 20;
        int quantidadepessoas=3;
        
           
        
        boolean acompanhado;
        
        //System.out.println(acompanhado);
        
        if (quantidadepessoas >=2){
            acompanhado =true;
        }else{
            acompanhado =false;
        }
      
        System.out.println("Valorde acompanhado: "+acompanhado);
        
        
        if (idade > 18 || acompanhado == true) {
            System.out.println("seja bem vindo");

        } else {
            System.out.println("Infelizmente Voce nao pode entrar");

        }
        
        //Boolean
        
        
        
        
        
        

    }
}
