/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg17.maximo.y.minimo.pkg2;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class MaximoYMinimo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1;
        int maximo=-999999;
        int minimo=999999;
        int cantidad = 0;
        Scanner entradaEscaner = new Scanner(System.in);
        
        System.out.println("La siguiente cadena terminará cuando se introduzca un 0.");
        while(numero !=0 ){
            System.out.println("Introduce un número: ");
            numero = entradaEscaner.nextInt();
            if(numero != 0){
                 if(numero > maximo){
                maximo = numero;
                }
                if(numero < minimo){
                minimo = numero;
                }
                cantidad++;
            }
        }
        if (cantidad < 2){
            System.out.println("Se han introducido " + cantidad + " números. No son suficientes para saber el máximo y el mínimo");
        }
        else{
            System.out.println("Se han introducido " + cantidad + " números. El mayor es " + maximo + " y el menor " + minimo);
        }
    }
}
