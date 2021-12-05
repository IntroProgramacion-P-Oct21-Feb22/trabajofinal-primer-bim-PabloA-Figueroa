/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int anguloA;
        int anguloB;
        int anguloC;
        int sumaABC = 0;

        
        System.out.println("Ingrese el Angulo A");
        anguloA = entrada.nextInt();
        System.out.println("Ingrese el angulo B");
        anguloB = entrada.nextInt();
        System.out.println("Ingrese el Angulo C  ");
        anguloC = entrada.nextInt();
        sumaABC = anguloA + anguloB + anguloC;

        
        
        if (anguloA == 90|| anguloB == 90 || anguloC == 90) {
            System.out.println("La suma de los angulos es: " + sumaABC + "°");
            System.out.println("El tipo de triangulo es: rectanngulo"  );
            
        }
            else{
       
                if(anguloA > 90 && anguloA < 180 || anguloB > 90 && anguloB < 180
              || anguloC > 90 && anguloC < 180 ) {
                System.out.println("La suma de los angulos es: " + sumaABC + "°");
                System.out.println("El tipo de triangulo es: obtusangulo"  );
                }
            else {
       
                if (anguloA < 90 && anguloB < 90 && anguloC < 90) {
                    System.out.println("La suma de los angulos es: " + sumaABC + "°");
                    System.out.println("El tipo de triangulo es: acutangulo" );
                }
                }
    }
    }    
}
