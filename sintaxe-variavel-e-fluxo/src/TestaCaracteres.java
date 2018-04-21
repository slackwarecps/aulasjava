/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabioalvaro
 */
public class TestaCaracteres {
    public static void main(String[] args){
        
        // unicode 16 bits
        //unico codigo da tabela unicode, nota musical etc...
        //caracter é uma variavel do tipo numerico
        //muito parecido com um short
        char letra ='a';
        System.out.println(letra);


        char valor=66;
        System.out.println(valor);
        
        //ou seja o 66 é a letra B!!
        //um char cabe em um inteiro
        // mas um inteiro nao cabe em um char
        valor = (char)(valor +  1 );        
        System.out.println(valor);
        
        
        
        
        //o que usamos em todo santo dia é o String
        // String nao é palavra chave do java
        
        
        //String é um tipo referencia!!! pois é um Objeto
        
        
        String palavra = "Alura cursos online de tecnologia";        
        System.out.println(palavra);
        
        //Podemos somar strings concatenando e criando uma nova
        
        
        palavra = palavra + 2020;
        System.out.println(palavra);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
