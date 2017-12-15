/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg14.pkgswitch;

/**
 *
 * @author Bonoso
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int caso  = 1;
        int contador = 100;
        
        while (contador!=0){
            switch(caso){
                case 1:
                    System.out.println("Hola");
                    caso += 1;
                    break;
                    
                case 2:
                    System.out.println("Adiós");
                    caso -= 1;
                    break;
            }
            contador--;
        }
    }
    
}
