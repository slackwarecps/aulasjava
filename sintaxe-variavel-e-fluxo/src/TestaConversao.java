/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabioalvaro
 */
public class TestaConversao {
    public static void main(String[] args){
        double salario = 1270.50;
        
       // float pontoFlutuante = (float) 3.14;
        
        
        //cast
        int valor = (int)  salario;     
        
        System.out.println(valor);
        
        //int pode guardar ate dois Bilhoes
        
        
        long numeroGrande = 1231231212312312331L;
     
        short valorPequeno =12313;
        
        byte b= 127;
        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1+valor2;
        System.out.println(total);
        
        
        
        
    }
    
}
