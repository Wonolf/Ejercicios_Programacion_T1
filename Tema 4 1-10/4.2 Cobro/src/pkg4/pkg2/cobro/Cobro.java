/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg2.cobro;

/**
 *
 * @author Bonoso
 */
public class Cobro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unidades_vendidas=300;
        int precio=9;
        double parte;
        int ganancia;
        
        ganancia=unidades_vendidas*precio;
        parte=ganancia/5;
        
        System.out.println("Se vendieron " + unidades_vendidas + " unidades a " + precio + "€ cada una.");
        System.out.println("Cada trabajador cobrará " + parte + "€ y el diseñador cobrará " + parte*2 + "€.");
    }
    
}
