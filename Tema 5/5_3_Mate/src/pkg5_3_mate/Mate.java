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
public class Mate {
    private int numero1, numero2;
    private final Scanner entradaMate = new Scanner(System.in);
    
    public void Factorial(){
        int factorial =  1;
        
       System.out.println("Introduce el número del que quieres calcular el factorial: ");
       numero1 = entradaMate.nextInt();
            
       if (numero1 > 0){
       for(int i = numero1; i > 0; i--){
           factorial*= i;
        }
        System.out.println("El factorial de " + numero1 + " es " + factorial);
       }
       else System.out.println("El factorial de un número negativo no existe.");
    }
    
    public void Primo(){
        boolean esPrimo = true;
        
        System.out.println("Introduce un número para saber si es primo: ");
        numero1 = entradaMate.nextInt();
        
        for (int i = 2; i <= (numero1/2); i++){
            if(numero1%i==0){
               esPrimo = false;
               i = numero1;
            }
            else{
               esPrimo = true;
            }
        }
        if(numero1 == 2){
            System.out.println("El número " + numero1 + " es primo");
        }
        else if(esPrimo == true){
            System.out.println("El número " + numero1 + " es primo");
        }
        else{
            System.out.println("El número " + numero1 + " no es primo");
        }
    }
    
    public void Perfecto(){
        int sumaDiv = 0;
        
        System.out.println("Introduce un número para saber si es perfecto: ");
        numero1 = entradaMate.nextInt();
        
        if (numero1 > 1){
            for (int i = 1; i <= numero1/2; i++){
                if (numero1 %  i == 0) sumaDiv += i;
            }
            
            if (numero1 == sumaDiv) System.out.println("El número " + numero1 + " es perfecto.");
            else System.out.println("El número " + numero1 + " no es perfecto");
        }
        else System.out.println("Error. Introduce un número mayor que 1");
    }
    
    public void Amigos(){
        int sumaDiv1 = 0, sumaDiv2 = 0;
        
        System.out.println("Introduce un número: ");
        numero1 = entradaMate.nextInt();
        
        System.out.println("Introduce otro número: ");
        numero2 = entradaMate.nextInt();
        
        for(int i = 1; i <= numero1/2; i++){
            if (numero1 % i == 0) sumaDiv1 += i;
        }
        
        for(int j = 1; j <= numero2/2; j++){
            if (numero2 % j == 0) sumaDiv2 += j;
        }
        
        if (sumaDiv1 == numero2 && sumaDiv2 == numero1){
            System.out.println("Los números " + numero1 + " y " + numero2 + " son amigos.");
        }
        else System.out.println("Los números no son amigos.");
    }
    
    public void Primos(){
        int div1 = 1, div2 = 1;
        int divComun = 1;
        
        System.out.println("Introduce un número: ");
        numero1 = entradaMate.nextInt();
        
        System.out.println("Introduce otro número: ");
        numero2 = entradaMate.nextInt();
        
        for(int i = 1; i <= numero1/2; i++){
            if (numero1 % i == 0) div1 = i;
            
            for(int j = 1; j <= numero2/2; j++){
                if (numero2 % j == 0) div2 = j;
                if (div1 == div2) divComun = div2;
            }
        }
        
        if (divComun == 1) System.out.println("Los números " + numero1 + " y " + numero2 + " son primos relativos");
        else System.out.println("Los números no son primos relativos");
    }
    
    public void MaximoComun(){
        int div1 = 1, div2 = 1;
        int divComun;
        int divMax = 1;
        
        System.out.println("Introduce un número: ");
        numero1 = entradaMate.nextInt();
        
        System.out.println("Introduce otro número: ");
        numero2 = entradaMate.nextInt();
        
        for(int i = 1; i <= numero1/2; i++){
            if (numero1 % i == 0) div1 = i;
            
            for(int j = 1; j <= numero2/2; j++){
                if (numero2 % j == 0) div2 = j;
                            
                if (div1 == div2){
                    divComun = div2;
                    if (divMax < divComun) divMax = divComun;
                }
            }
        }
        
        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es " + divMax);
   
    }
    
    public void Potencia(){
        int potencia;
        int resultado;
        
        System.out.println("Introduce un número: ");
        numero1 = entradaMate.nextInt();
        
        System.out.println("Introduce el exponente de la potencia: ");
        potencia = entradaMate.nextInt();
        
        switch (potencia) {
            case 0:
                resultado = 1;
                break;
            case 1:
                resultado = numero1;
                break;
            default:
                resultado = numero1;
                for (int i = potencia; i > 0; i--) resultado *= numero1;
                break;
        }

        System.out.println( numero1 + " ^ " + potencia + " = " + resultado);
    
    }
}
