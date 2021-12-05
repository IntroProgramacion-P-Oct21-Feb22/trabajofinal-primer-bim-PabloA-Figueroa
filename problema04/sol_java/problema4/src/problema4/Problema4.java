/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int valor1;
        int valor2;
        int valor3;
        
        System.out.println("Ingrese el valor 1");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el valor 2");
        valor2 = entrada.nextInt();
        System.out.println("Ingrese el valor 3");
        valor3 = entrada.nextInt();
        
        if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
            System.out.println("Error, valores iguales"); }
        else{
            if (valor1 > valor2  && valor1 > valor3) {
            System.out.println("El numero mayor es: " + valor1); }
            else{
                if (valor1 < valor2  && valor2 > valor3) {
                System.out.println("El numero mayor es: " + valor2); }
                else{
                    if (valor3 > valor2  && valor1 < valor3) {
                    System.out.println("El numero mayor es: " + valor3); }
            
            
            }
            }                                             
    }    
    }
    
}
