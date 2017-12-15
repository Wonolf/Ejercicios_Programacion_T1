/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg18.numero.combinatorio;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class NumeroCombinatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroA=0;
        int numeroB=0;
        int resta;
        int factorialA=1;
        int factorialB=1;
        int factorialR=1;
        double resultado;
        int aux;
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número A: ");
        numeroA = entradaTeclado.nextInt();
        
        System.out.println("Introduce un número B: ");
        numeroB = entradaTeclado.nextInt();
        
        if(numeroA<numeroB){
            aux = numeroA;
            numeroA = numeroB;
            numeroB = aux;
        }
            
        resta = numeroA - numeroB;
            
         if ((numeroA < 0)||(numeroB < 0)){
            System.out.println("No existe el factorial de un número negativo.");
        }
        else{
            while(numeroA>1){
                factorialA*=numeroA;
                numeroA--;
            }
            while(numeroB>1){
                factorialB*=numeroB;
                numeroB--;
             }
            while(resta>1){
                factorialR*=resta;
                resta--;
            }
        }
        resultado = factorialA/((factorialB)*(factorialR)); 
        System.out.println("El resultado es " + resultado);
    }
}