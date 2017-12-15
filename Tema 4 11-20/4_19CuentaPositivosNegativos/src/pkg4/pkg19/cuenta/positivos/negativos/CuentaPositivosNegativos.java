/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg19.cuenta.positivos.negativos;

/**
 *
 * @author Bonoso
 */
import java.util.Scanner;
public class CuentaPositivosNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=1;
        int cuentaPos=0;
        int cuentaNeg=0;
        int cantidad=0;
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("La siguiente cadena terminará cuando se introduzca un 0.");
        
        while(numero !=0 ){
            System.out.println("Introduce un número: ");
            numero = entradaTeclado.nextInt();
            if(numero != 0){
                 if(numero > 0){
                     cuentaPos++;
                }
                if(numero < 0){
                     cuentaNeg++;
                }
                cantidad++;
            }
        }
        
        if(cantidad == 0){
            System.out.println("No se ha introducido ningún número");
        }
        else{
            System.out.println("Se han introducido " + cantidad + " números. De los cuales " + cuentaPos + " son positivos y " + cuentaNeg + " son negativos.");
        }
    }
    
}
