package estructura_switch;

import java.util.Scanner;

public class Estructura_Switch {

    public static void main(String[] args) {

        int num;

        System.out.println("introducir calificacion");
        Scanner leer = new Scanner(System.in);

        num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println("Calificacion B");
                break;
                
            case 2:
                System.out.println("Calificacion B");
                break;
                
            default ->
                System.out.println("Mes no valido");
        }

    }

}
