/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabioalvaro
 */
public class TestaLacos {
    public static void main(String[] args) {
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println("Tabuada do "+multiplicador);
            for (int contador = 0; contador <= 10; contador++) {
                System.out.print(contador*multiplicador);
                 System.out.print(" ");
                
            }
            System.out.println();
        }
    }
}
