package clase1;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        int num1;
        int num2 =0;

        int mul = 1;
        float div = 1;
        int sum = 0;
        int res = 0;

        for (int i = 1; i < 5; i++) {

            System.out.println("numero " + i + " =");
            Scanner leer1 = new Scanner(System.in);
            num1 = leer1.nextInt();

            if (num1 > 10) {
                mul = mul * num1;
                div = num1 / div;

            } else {
                sum = sum + num1;
                res = res - num1;

            }

        }
        System.out.println("La multiplicacion de los numeros es: " + mul);
        System.out.println("La divicion de los numeros es: " + div);
        System.out.println("La suma de los numeros es: " + sum);
        System.out.println("La resta de los numeros es: " + res);

    }

}
