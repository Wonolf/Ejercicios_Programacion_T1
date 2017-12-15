/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg16.maximoyminimo;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class MaximoyMinimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        int numero=0;
        int maximo=-999999;
        int minimo=999999;
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Introduce el número de dígitos que tendrá la cadena: ");
        cantidad = entradaEscaner.nextInt();
        
        while(cantidad >0){
            System.out.println("Introduce un número: ");
            numero = entradaEscaner.nextInt();
            if(numero > maximo){
                maximo = numero;
            }
            if(numero < minimo){
                minimo = numero;
            }
            cantidad--;
        }
        System.out.println("El número mayor es " + maximo + " y el número menor es " + minimo);
    }
    
}
