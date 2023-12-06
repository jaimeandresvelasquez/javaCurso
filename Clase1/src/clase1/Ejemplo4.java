package clase1;

import java.util.Scanner;

public class Ejemplo4 {

    public static void main(String[] args) {

        float nPreg;
        float nResp;
        float porc;

        System.out.println("Numero de preguntas= ");
        Scanner leer1 = new Scanner(System.in);
        nPreg = leer1.nextInt();
        System.out.println("Numero de preguntas correctas=");
        Scanner leer2 = new Scanner(System.in);
        nResp = leer2.nextInt();

        porc = (nResp / nPreg) * 100;
        System.out.println(porc);

        if (porc >= 90) {
            System.out.println("Nivel maximo");

        } else if (porc >= 75 & porc < 90) {
            System.out.println("Nivel medio");
        } else {
            System.out.println("Nivel bajo");
        }
    }

}
