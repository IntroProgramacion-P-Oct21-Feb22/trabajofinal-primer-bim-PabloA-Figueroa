/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int precioT;
        int numeroT;
        double porcentaje1 = 20 ;
        double porcentaje2 = 25 ;
        double porcentaje3 = 40 ;
        double porcentaje4 = 50 ;
        double descuento;
        double valorSub;
        double valorTot;
        
        System.out.println("Ingrese el numero de trajes a comprar");
        numeroT = entrada.nextInt();
        System.out.println("Ingrese el precio de los trajes a comprar");
        precioT = entrada.nextInt();
        valorSub = precioT * numeroT ; 
        valorTot = precioT * numeroT ;
        descuento = 0;
        
        if (numeroT == 1) {
            descuento = ( porcentaje1 * valorTot)/100 ; 
            valorTot = valorTot - descuento;
        } else {
            if (numeroT == 2) {
            descuento = ( porcentaje2 * valorTot)/100 ; 
            valorTot = valorTot - descuento;
        } else {
                if (numeroT == 3) {
            descuento = ( porcentaje3 * valorTot)/100 ; 
            valorTot = valorTot - descuento;
        } else {
                    if (numeroT > 3) {
            descuento = ( porcentaje4 * valorTot)/100 ; 
            valorTot = valorTot - descuento;
        } else {
                }
            }
        }
        }  
        System.out.println("Ingrese el valor total a pagar es: " + valorTot);
        System.out.println("Ingrese el valor del descuento es: " + descuento);
        System.out.println("Ingrese el valor subtotal a pagar es: " + valorSub);

    }
    
}
