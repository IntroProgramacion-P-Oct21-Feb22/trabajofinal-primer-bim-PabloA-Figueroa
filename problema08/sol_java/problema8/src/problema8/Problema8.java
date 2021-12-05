/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        double metro = 1;
        double centimetro ;
        double pulgada ;
        double pies ;
        double yarda ;
        String cadena = "";
        
        System.out.println ("Ingrese el numero de metros: ");
        limite = entrada.nextInt();
        
        while (metro <= limite){
            centimetro = metro * 100;
            pulgada = centimetro / 2.54;
            pies = pulgada / 12;
            yarda = pies / 3;
            cadena= cadena + metro + "  |  " + yarda + "  |  "  + pulgada 
                    + "  |  " +  pies +"\n";
            metro = metro + 1;
        }
        System.out.println("Metros  |  Yardas  |  Pulgadas  |  pies");
        System.out.printf( cadena);
    }
    
}
