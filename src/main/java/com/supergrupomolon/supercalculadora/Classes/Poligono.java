package com.supergrupomolon.supercalculadora.Classes;

public class Poligono {
    private int numLados;
    private double lado;
    private double apotema;

    public double perimetro() {
        double perimetro = 0;

        perimetro = this.numLados * this.lado;

        return perimetro;
    }

    public double area() {
        double area = 0;

        area = this.numLados * this.lado * this.apotema;

        area /= 2;

        return (Math.round(area * 100.0) / 100.0);
    }

    public Poligono(int numLados, double lado) {
        this.numLados = numLados;
        this.lado = lado;
        this.apotema = (this.lado / (2 * Math.tan(Math.toRadians(180.0 / this.numLados))));
    }
}
