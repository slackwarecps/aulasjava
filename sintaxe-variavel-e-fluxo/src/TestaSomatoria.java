/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabioalvaro
 */
public class TestaSomatoria {
    public static void main(String[] args) {
        int contador =0;
        int total=0;
        while (contador <=10) {                 
            //total = total +contador;            
            total+=contador;
            contador++;
        }
        System.out.println("Total: "+total);
    }
    
}
