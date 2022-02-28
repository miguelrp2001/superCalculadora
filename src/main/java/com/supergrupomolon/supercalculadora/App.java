package com.supergrupomolon.supercalculadora;

import com.supergrupomolon.supercalculadora.Classes.Pitagoras;
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
                double catetoA = -1, catetoB = -1, hipotenusa = -1;
                String ladoIncognito = "n";
                System.out.println(
                        "Para calcular el teorema de pitágoras, debemos saber al menos 2 de los lados de un triángulo rectángulo.\nA contunación, introduzca los lados del triángulo rectángulo, en el lado incógnito, introduzca 0.\n\n                     *\n                     * *\n                     *   *     C\n                 A   *     *   \n                     *       *\n                     *         *\n                     * * * * * * * \n                           B\n                     \n\n\n");

                while (catetoA < 0) {
                    System.out.print("Cateto A: ");
                    catetoA = teclado.nextDouble();
                    if (catetoA == 0) {
                        ladoIncognito = "el cateto A";
                    }
                }
                while (catetoB < 0) {
                    System.out.print("Cateto B: ");
                    catetoB = teclado.nextDouble();
                    if (catetoB == 0) {
                        ladoIncognito = "el cateto B";
                    }
                }
                while (hipotenusa < 0) {
                    System.out.print("Hipotenusa: ");
                    hipotenusa = teclado.nextDouble();
                    if (hipotenusa == 0) {
                        ladoIncognito = "la hipotenusa";
                    }
                }

                double resultado = Pitagoras.calcularPitagoras(catetoA, catetoB, hipotenusa);

                System.out.println("Según nuestros cálculos, " + ladoIncognito + " es de: " + resultado);

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
