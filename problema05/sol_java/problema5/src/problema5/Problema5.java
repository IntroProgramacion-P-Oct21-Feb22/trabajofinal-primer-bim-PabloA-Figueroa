/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int puntoX;
        int puntoY;
        
        System.out.println("Ingrese el punto X");
        puntoX = entrada.nextInt();
        System.out.println("Ingrese el punto Y");
        puntoY = entrada.nextInt();
        
        if (puntoX < 0 && puntoY <0) {
            System.out.println("Pertenece al tercer cuadrante"); }
        else{
            if (puntoX >= 0  && puntoY < 0) {
            System.out.println("ertenece al segundo cuadrante"); }
            else{
                if (puntoX > 0  && puntoY > 0) {
                System.out.println("Pertenece al primer cuadrante"); }
                else{
                    if (puntoX < 0  && puntoY >= 0) {
                    System.out.println("Pertenece al cuarto cuadrante"); }
                        else{
                        if (puntoX == 0  && puntoY == 0) {
                        System.out.println("coordenadas pertenecientes al origen es decir 0" ); }
            }
            }
            }                                             
    }  
    }
    
}
