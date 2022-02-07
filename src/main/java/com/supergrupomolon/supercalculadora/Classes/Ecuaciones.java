package com.supergrupomolon.supercalculadora.Classes;

import java.util.ArrayList;

public class Ecuaciones {
    
    /**
     * 
     * @param a Primer valor de la ecuación de primer grado
     * @param b Segundo valor de la ecuación de primer grado
     * @param c Tercer valor de la ecuacion
     * 
     * La ecucacion se establece así: ax + b = c
     * 
     * @return Devuleve un valor double
     */
    public double primerGrado(double a, double b, double c){
        return a/(c-b);
    }

    /**
     * 
     * @param a Primer valor de la ecuación de segundo grado
     * @param b Segundo valor de la ecuación de segundo grado
     * @param c Tercer valor de la ecuación de segundo grado
     * @return Devuelve un ArrayList con dos valores, 1 o ninguno en función de los parametros dados
     */
    public ArrayList segundoGrado(double a, double b, double c){

        double result = (b*b) - 4*a*c;

        ArrayList<Double> arr = new ArrayList<Double>();

        if(result > 0.0){
            arr.add(-b + Math.pow(result, 0.5) / (2.0*a));
            arr.add(-b - Math.pow(result, 0.5) / (2.0*a));

            return arr;

        }else if(result == 0.0){
            arr.add(-b/(2.0*a));

            return arr;

        }else{
            return arr;
        }
    }
}
