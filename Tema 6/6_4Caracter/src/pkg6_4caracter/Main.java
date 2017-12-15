/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_4caracter;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caracter caracter = new Caracter();
        char letra;
        int ascii = -1;
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un caracter: ");
        letra = entradaTeclado.next(".").charAt(0);
        
        while(ascii < 0 || ascii > 255){
            System.out.println("Introduce un número del código ascii [0 - 255]: ");
            ascii = entradaTeclado.nextInt();
        }
        
        System.out.println("El caracter " + letra + " equivale al número " + caracter.Ordinal(letra)  + " del código ascii");
        System.out.println("El número " + ascii + " equivale al caracter " + caracter.Ascii(ascii)  + " del código ascii");
    }
}
