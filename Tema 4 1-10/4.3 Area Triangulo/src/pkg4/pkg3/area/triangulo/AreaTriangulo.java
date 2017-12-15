/*
 * to change this license header, choose License Headers in Project Properties.
 * to change this template file, choose tools | templates
 * and open the template in the editor.
 */
package pkg4.pkg3.area.triangulo;

import static java.lang.Math.sqrt;

/**
 *
 * @author Bonoso
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lado1=3;
        int lado2=4;
        int lado3=5;
        double t;
        double resultado;
        
        t = (lado1 + lado2 + lado3)/2;
        resultado = sqrt(t*(t-lado1)*(t-lado2)*(t-lado3));
        
        System.out.println("Los tres lados del triángulo miden " + lado1 + ", " + lado2 + ", " + lado3 + ".");
        System.out.println("El área del triángulo es de " + resultado + ".");
    }
    
}
