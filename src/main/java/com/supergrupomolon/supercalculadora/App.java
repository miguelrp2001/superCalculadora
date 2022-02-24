package com.supergrupomolon.supercalculadora;

import com.supergrupomolon.supercalculadora.Classes.Poligono;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.print(opciones.menu());
        Scanner teclado = new Scanner(System.in);
        System.out.print("Opción: ");
        int opcion = teclado.nextInt();
        int opcion2 = 0;
        int nLados;
        double lado;

        switch (opcion) {
            case 1:
                System.out.print(opciones.basica());
                opcion2 = teclado.nextInt();
                break;
            case 2:
                System.out.print("Numero de lados: ");
                nLados = teclado.nextInt();
                System.out.print("Medida del lado: ");
                lado = teclado.nextDouble();
                Poligono nuevo = new Poligono(nLados, lado);
                System.out.print("El área es de: ");
                System.out.println(nuevo.area());
                System.out.print("El perímetro es de: ");
                System.out.println(nuevo.perimetro());
                break;
            case 3:

                break;
            case 4:
                System.out.print(opciones.ecuaciones());
                opcion2 = teclado.nextInt();
                break;

            default:
                break;
        }

        if (opcion2 > 0 && opcion == 1) {
            opciones.menuBasica(opcion2);

        }
        if (opcion2 > 0 && opcion == 4) {
            opciones.menuEcuaciones(opcion2);

        }
    }
}
