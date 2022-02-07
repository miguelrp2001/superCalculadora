package com.supergrupomolon.supercalculadora;

import com.supergrupomolon.supercalculadora.Classes.Poligono;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Poligono cuadrado = new Poligono(6, 8);

        System.out.println(cuadrado.area());
        System.out.println(cuadrado.perimetro());
    }
}
