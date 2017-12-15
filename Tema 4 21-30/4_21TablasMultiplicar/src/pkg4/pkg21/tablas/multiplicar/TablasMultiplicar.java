/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg21.tablas.multiplicar;

/**
 *
 * @author Bonoso
 */
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = 0;
        
        for (int i = 1; i <=10; i++){
            for (int j = 1; j <=10; j++){
                resultado = i * j;
                System.out.println(i + " * " + j + " = " + resultado);
            }
        }
    }
    
}
