/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaperimetrotriangulo;

import java.util.Scanner;

class AreaPerimetroTriangulo {

    public static void main(String[] args) {

        int area;
        int perimetro;
        int alto;
        int ancho;

        System.out.println("Por favor suministrar los datos en numeros enteros");
        System.out.println("Altura: ");
        Scanner consola = new Scanner(System.in);
        alto = consola.nextInt();
        System.out.println("Alto: ");
        Scanner consola2 = new Scanner(System.in);
        ancho = consola2.nextInt();

        area = alto * ancho;
        perimetro = (alto + ancho) * 2;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }

}
