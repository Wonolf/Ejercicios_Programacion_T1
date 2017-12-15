/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg12.factorial2;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class Factorial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner entradaEscaner= new Scanner(System.in);
        
        System.out.println("Introduce un número para calcular el factorial: ");
        numero = entradaEscaner.nextInt();
        
        int factorial = 1;
        
        if(numero == 0){
            System.out.println("El factorial de " + numero + " siempre es " + factorial);
        }
        else if (numero < 0){
            System.out.println("No existe el factorial de un número negativo.");
        }
        else{
            while(numero>1){
                factorial*=numero;
                numero--;
            }
            System.out.println("El resultado del factorial es " + factorial);
        }
    }
    
}
