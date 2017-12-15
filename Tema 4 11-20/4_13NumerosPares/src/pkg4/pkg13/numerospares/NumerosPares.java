/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg13.numerospares;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int aux;
        
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        numero1 = entradaEscaner.nextInt ();
        
        System.out.println("Introduzca otro número: ");
        numero2 = entradaEscaner.nextInt ();
        
        if(numero1<numero2){
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        
        int sumaPares = 0;
        int cuentaPares = 0
                ;
        while (numero1>=numero2){
            if(numero2%2==0){
                sumaPares += numero2;
                cuentaPares += 1;
                System.out.println(numero2);
            }
            numero2++;
        }
        System.out.println("Hay " + cuentaPares + " números pares, la suma de todos ellos da " +sumaPares);
    }
    
}
