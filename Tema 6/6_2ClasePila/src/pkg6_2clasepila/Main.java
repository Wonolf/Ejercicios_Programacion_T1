/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_2clasepila;

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
        Pila pila = new Pila();
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        pila.Push(entradaTeclado.nextInt());
        
        if (pila.Vacia()) System.out.println("La pila está vacía.");
        else pila.Cima();
        
        pila.Pop();
        
        if (pila.Vacia()) System.out.println("La pila está vacía.");
        else pila.Cima();
    }
    
}
