/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_2_urnatrampa;

/**
 *
 * @author Bonoso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UrnaTrampa urna= new UrnaTrampa(10,10);     //Cambiar los números a gusto (Blancas, Negras)
        
        while(urna.GetBolaBlanca() > 0 || urna.GetBolaNegra() > 0){
            urna.ExtraeBolas();
            }
    }
    
}
