/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg20.media.aritmetica;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class MediaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=1;
        double suma=0;
        int contador=0;
        double resultado;
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("La siguiente cadena terminará cuando se introduzca un 0.");
        System.out.println("Introduce un número: ");
        
        while(numero !=0 ){
            numero = entradaTeclado.nextInt();
            if(numero != 0){
                suma+=numero;
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("No se ha introducido ningún número");
        }
        else{
            resultado = suma / contador;
            System.out.println("La media aritmética de los " + contador + " números introducidos es de " + resultado);
        }
    }
    
}
