/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreE ;
        int tipoE;
        double numeroH;
        double cuota1 = 1.5;
        double cuota2 = 2;
        double cuota3 = 2.5;
        double cuota4 = 3;
        double valorSub;
        double valorTot;
        
        System.out.println("Ingrese el nombre del trabajador");
        nombreE = entrada.nextLine();
        System.out.println("Ingrese el tipo de trabajador (1,2,3 o 4)");
        tipoE = entrada.nextInt();
        System.out.println("Ingrese el numeros de horas trabajadas");
        numeroH = entrada.nextDouble();
        valorSub = numeroH   * 1 ; 
        valorTot = 0; 
        
        if (tipoE  == 1) {
            valorTot = valorSub * cuota1;
        } else {
            if (tipoE == 2) {
            valorTot = valorSub * cuota2;
        } else {
                if (tipoE == 3) { 
            valorTot = valorSub * cuota3;
        } else {
                    if (tipoE == 4) {
            valorTot = valorSub * cuota4;
        } else {
                }
            }
        }
        }  
        System.out.println("Ingrese el valor del sueldo total es: " + valorTot);
        System.out.println("Ingrese el valor subtotal del sueldo es: " + valorSub);

    }
    
}
