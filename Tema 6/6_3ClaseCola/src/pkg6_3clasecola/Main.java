/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_3clasecola;

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
        Cola cola = new Cola();
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        cola.PonPrimero(entradaTeclado.nextInt());
        
        if (cola.Vacio()) System.out.println("La pila está vacía.");
        else cola.Frente();
        
        cola.ExtraeDeCola();
        
        if (cola.Vacio()) System.out.println("La pila está vacía.");
        else cola.Frente();
    }
    
}
