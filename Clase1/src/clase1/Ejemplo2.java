/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        
        System.out.println("Numero= ");
        Scanner leer  = new Scanner(System.in);
        int num=leer.nextInt();
        
        if (num>=0) {
            
            System.out.println("El numero es positivo");
            
        }else{
            System.out.println("El numero es negativo");
        }
    }
    
}
