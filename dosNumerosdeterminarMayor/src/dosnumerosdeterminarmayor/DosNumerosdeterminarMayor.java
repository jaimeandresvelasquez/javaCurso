package dosnumerosdeterminarmayor;

import java.util.Scanner;

public class DosNumerosdeterminarMayor {

    public static void main(String[] args) {

        int numero1;
        int numero2;

        System.out.println("Dos numeros enteros");
        System.out.println("Numero 1");
        Scanner leer = new Scanner(System.in);
        numero1 = leer.nextInt();
        System.out.println("Numero 2");
        Scanner leer1 = new Scanner(System.in);
        numero2 = leer.nextInt();

        if (numero1 > numero2) {

            System.out.println("El mayor es: " + numero1);

        } else {
            System.out.println("El mayor es: " + numero2);
        }

    }

}
