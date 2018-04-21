/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabioalvaro
 */
public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        
        int idade = 16;
        int quantidadePessoas=3;
        
        if (idade> 18){
            System.out.println("Voce tem mais que 18 anos");
            System.out.println("seja bem vindo");
        }else{
            if (quantidadePessoas>=2){
                System.out.println("voce nao tem 18 mas esta "+
                        "acompanhado");
            }else{
                System.out.println("Infelizmente Voce nao pode entrar");
            }
            
        }
        
        // If sem chaves com apenas uma condicao!
//        if (idade> 18)
//            System.out.println("Voce tem mais que 18 anos");
        
        

        
        
        
        
    }
}
