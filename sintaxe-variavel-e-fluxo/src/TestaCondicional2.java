/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabioalvaro
 */
public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 20;
        int quantidadepessoas=3;
        
        //Expressao booleana
        
        

        boolean acompanhado = quantidadepessoas >=1;
                //true;//palavra reservado em minusculo nao aceita 
        //True por exemplo

        // Nao exite palavra OR é sim ||
        // condicao E &&
                System.out.println("Valorde acompanhado: "+acompanhado);
        
        
        if (idade > 18 || acompanhado == true) {
            System.out.println("seja bem vindo");

        } else {
            System.out.println("Infelizmente Voce nao pode entrar");

        }
        
        //Boolean
        
        
        
        
        
        

    }
}
