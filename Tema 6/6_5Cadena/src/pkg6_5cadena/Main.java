/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_5cadena;

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
        Scanner entradaTeclado = new Scanner(System.in);
        String entrada;
        
        System.out.println("Introduce una cadena de caracteres: ");
        entrada = entradaTeclado.nextLine();
        
        Cadena cadena = new Cadena(entrada);
        
        //Invierte cadena
        cadena.inviertecadena();
        
        //encripta cadena
        cadena.encriptaCadena();
        
        //desencripta cadena
        cadena.desencriptaCadena();
        
        //visualiza cadena
        cadena.visualizaCadena();
    }
    
}
