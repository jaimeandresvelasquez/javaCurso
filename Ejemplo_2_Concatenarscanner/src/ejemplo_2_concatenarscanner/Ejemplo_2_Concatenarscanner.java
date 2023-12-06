package ejemplo_2_concatenarscanner;

import java.util.Scanner;

/**
 *
 * @author J_andres_V
 */
public class Ejemplo_2_Concatenarscanner {

    public static void main(String[] args) {
        System.out.println("Por favor introducir los siguientes datos");
        System.out.println("Proporcionar titulo:");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Proporcionar Autor");
        var autor = consola.nextLine();
        System.out.println("El libro es " + titulo + " y el autor es " + autor);
        sout

    }

}
