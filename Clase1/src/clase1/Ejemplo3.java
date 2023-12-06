/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

import java.util.Scanner;

public class Ejemplo3 {
    
    public static void main(String[] args) {
        
        int contador=0;
        
        System.out.println("Numero de 3 cifras=");
        
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        while(num>0){
            num = num/10;
            ++contador ;
            
        }
        System.out.println("Numero de digitos= "+contador);
    }
    
}
