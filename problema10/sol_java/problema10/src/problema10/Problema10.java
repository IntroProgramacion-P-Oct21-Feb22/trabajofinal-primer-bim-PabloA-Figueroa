/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        double sumaXiX = 0 ;
        double numero;
        double XiX;
        double media = 0;
        double sumaNumeros = 0;
        double varianza = 0;
        int contador = 0;
        String salida; 
        boolean condicion = true; 
        
        while (condicion){
            System.out.println("Ingrese un numero " );
            numero = entrada.nextDouble ();
            sumaNumeros = sumaNumeros + numero;
            contador = contador + 1 ;
            entrada.nextLine();
            System.out.println("Ingrese si para salir");
            salida = entrada.nextLine();
            
            if (salida.equals("si")) {
                condicion = false; }

            media = sumaNumeros / contador;
            XiX = Math.pow((numero - media),2);
            sumaXiX = sumaXiX + XiX;
            varianza = sumaXiX/(contador - 1);
 
        }
        System.out.printf("La media aritmética es: %.2f\nLa varianza es: %.2f\n",
                media, varianza);
    }
    
}
