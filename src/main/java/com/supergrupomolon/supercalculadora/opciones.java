package com.supergrupomolon.supercalculadora;

import java.util.ArrayList;
import java.util.Scanner;

import com.supergrupomolon.supercalculadora.Classes.Basicas;
import com.supergrupomolon.supercalculadora.Classes.Ecuaciones;

public class opciones {
    public static String menu() {
        return "*****Menú***** \n1. Aritmética básica. \n2. Área polígonos regulares. \n3. Teorema de pitágoras. \n4. Ecuaciones \n";
    }

    public static String basica() {
        return "*****Aritmética básica***** \n1. Suma. \n2. Resta. \n3. Multiplicación. \n4. División. \n5. Logaritmo. \n6. Raíz. \n7. Potencia. \n";
    }

    public static String ecuaciones() {
        return "*****Ecuaciones***** \n1. Primer grado. \n2. Segundo grado. \n3. Ruffini. \n";
    }

    public static void menuEcuaciones(int op) {
        Ecuaciones ec = new Ecuaciones();
        Scanner t = new Scanner(System.in);
        double a, b, c;
        switch (op) {
            case 1:
                System.out.print("Numero 1: ");
                a = t.nextDouble();
                System.out.print("Numero 2: ");
                b = t.nextDouble();
                System.out.print("Numero 3: ");
                c = t.nextDouble();
                ec.primerGrado(a, b, c);
                break;
            case 2:
                System.out.print("Numero 1: ");
                a = t.nextDouble();
                System.out.print("Numero 2: ");
                b = t.nextDouble();
                System.out.print("Numero 3: ");
                c = t.nextDouble();
                System.out.print(ec.segundoGrado(a, b, c));
                break;
            case 3:
                int n1;
                System.out.print("Grado de la ecuación: ");
                n1 = t.nextInt();
                System.out.print(ec.ecuacionesSuperiores(n1));
                break;
        }
    }

    public static void menuBasica(int op) {
        Scanner t = new Scanner(System.in);
        double n1, n2;
        Basicas nuevo = new Basicas();
        switch (op) {

            case 1:
                System.out.print("Numero 1: ");
                n1 = t.nextDouble();
                System.out.print("Numero 2: ");
                n2 = t.nextDouble();
                System.out.print(nuevo.suma(n1, n2));
                break;
            case 2:
                System.out.print("Numero 1: ");
                n1 = t.nextDouble();
                System.out.print("Numero 2: ");
                n2 = t.nextDouble();
                System.out.print(nuevo.resta(n1, n2));
                break;
            case 3:
                System.out.print("Numero 1: ");
                n1 = t.nextDouble();
                System.out.print("Numero 2: ");
                n2 = t.nextDouble();
                System.out.print(nuevo.multiplicacion(n1, n2));
                break;
            case 4:
                System.out.print("Numero 1: ");
                n1 = t.nextDouble();
                System.out.print("Numero 2: ");
                n2 = t.nextDouble();
                System.out.print(nuevo.divison(n1, n2));
                break;
            case 5:
                System.out.print("Numero: ");
                n1 = t.nextDouble();
                System.out.print(nuevo.logaritmo(n1));
                break;
            case 6:
                System.out.print("Numero: ");
                n1 = t.nextDouble();
                System.out.print(nuevo.raiz(n1));
                break;
            case 7:
                System.out.print("Numero 1: ");
                n1 = t.nextDouble();
                System.out.print("Numero 2: ");
                n2 = t.nextDouble();
                System.out.print(nuevo.potencia(n1, n2));
                break;
            default:
                System.out.print("No existe esa opción. ");
                break;
        }
    }
}
