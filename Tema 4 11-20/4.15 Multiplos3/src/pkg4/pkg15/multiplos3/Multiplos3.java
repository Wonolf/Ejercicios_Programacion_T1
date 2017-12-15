/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg15.multiplos3;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class Multiplos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2, aux;
        boolean muestra = true;
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        numero1 = entradaEscaner.nextInt();
        
        System.out.println("Introduce otro número: ");
        numero2 = entradaEscaner.nextInt();
        
        if(numero1<numero2){
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        
        while(numero1>=numero2){
            if(numero2%3==0){
                if(muestra==true){
                    System.out.println(numero2);
                    muestra = false;
                }
                else{
                    muestra = true;
                }
            }
            numero2++;
        }
    }
    
}
