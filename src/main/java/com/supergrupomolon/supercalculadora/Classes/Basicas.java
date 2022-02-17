package com.supergrupomolon.supercalculadora.Classes;

public class Basicas {
    public double suma(double n1, double n2) {

        return n1 + n2;
    }

    public double resta(double n1, double n2) {

        return n1 - n2;
    }

    public double multiplicacion(double n1, double n2) {

        return n1 * n2;
    }

    public double divison(double n1, double n2) {

        return n1 / n2;
    }

    public double logaritmo(double n1) {
        return Math.log10(n1);
    }

    public double raiz(double n1) {
        return Math.sqrt(n1);
    }

    public double potencia(double n1, double n2) {
        return Math.pow(n1, n2);
    }
}
