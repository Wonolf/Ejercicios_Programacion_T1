/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_3_mate;

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
        String opcion;
        Mate mate = new Mate();
        boolean salir=false;
        Scanner entradaTeclado = new Scanner(System.in);
        
        while(salir==false){
            System.out.println("\nIntroduce una opción de las siguientes: \nfactorial\tprimo\t\tperfecto\namigos\t\tprimos\t\tmcd\npotencia\tsalir\n");
            System.out.println("Respuesta: ");
            opcion = entradaTeclado.nextLine();

            switch (opcion){
                case "factorial":
                    mate.Factorial();
                    break;
                case "primo":
                    mate.Primo();
                    break;
                case "perfecto":
                    mate.Perfecto();
                    break;
                case "amigos":
                    mate.Amigos();
                    break;
                case "primos":
                    mate.Primos();
                    break;
                case "mcd":
                    mate.MaximoComun();
                    break;
                case "potencia":
                    mate.Potencia();
                    break;
                case "salir":
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
