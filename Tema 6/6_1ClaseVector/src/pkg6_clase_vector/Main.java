/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_clase_vector;

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
        Lista lista = new Lista();
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un número para la primera posición: ");
        lista.ponPrimero(entradaTeclado.nextInt());
        
        System.out.println("Introduce un número para la última posición: ");
        lista.ponUltimo(entradaTeclado.nextInt());
        
        if (lista.estaVacia()) System.out.println("La lista está vacía");
        else lista.visualizaElementos();
        
        System.out.println(lista.extraePrimero());
        System.out.println(lista.extraeUltimo());
        
        if (lista.estaVacia()) System.out.println("La lista está vacía");
        else lista.visualizaElementos();
    }
    
}
