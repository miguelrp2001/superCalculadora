package com.supergrupomolon.supercalculadora.Classes;

public class Pitagoras {

    /**
     * 
     * @param catetoA    Tamaño del lado A del triángulo si no se conoce, es 0.
     * @param catetoB    Tamaño del lado B del triángulo si no se conoce, es 0.
     * @param hipotenusa Tamaño del lado C del triángulo si no se conoce, es 0.
     * @return Devolverá el valor del lado a descubrir.
     */
    public static double calcularPitagoras(double catetoA, double catetoB, double hipotenusa) {
        double resultado = 0;
        if (catetoA == 0) {
            resultado = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(catetoB, 2));
        } else if (catetoB == 0) {
            resultado = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(catetoA, 2));
        } else if (hipotenusa == 0) {
            resultado = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        }
        return (Math.round(resultado * 100.0) / 100.0);
    }
}
