/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 100;
        int numerador = 1;
        int denominador = 1;
        String cadena = "1 " ;
        
        while (denominador <= limite) {
            denominador = denominador + 1;
            cadena = cadena + "+ " + numerador + "/" + denominador+ " " ;
        
        }
        System.out.printf("%sResultado\n", cadena);
    }
    
}
