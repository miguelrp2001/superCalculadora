package com.supergrupomolon.supercalculadora.Classes;

import java.util.ArrayList;
import java.util.Scanner;

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
    public ArrayList<Double> segundoGrado(double a, double b, double c){

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

    /**
     * Calculará el resultado de Ruffini
     * @param mult Lista de multiplos que se usarán para comprobar la X
     * @param arr Lista de los valores independientes del array
     * @return Valor de la X
     */
    public int Ruffini(ArrayList<Integer> mult, ArrayList<Integer> arr){

        int exponente = arr.size()-1;

        for (Integer mul : mult) {
            int flag=0;
            for (Integer val : arr) {
                if(exponente>0){
                    flag += val*(Math.pow(mul, exponente)); 
                }else{
                    flag += val;
                }

                exponente--;
            }
            
            if(flag == 0){
                return mul;
            }

            exponente = arr.size()-1;
        }

        return 0;
    }

    /**
     * 
     * @param grado Tamaño de la ecuación que se usará para delimitar la ecuación
     * @return Devolverá un string erroneo si el calculo por Ruffini no es exacto, y un string con el resultado correcto si encuentra la solución
     */
    public String ecuacionesSuperiores(int grado){
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> multiplos = new ArrayList<Integer>();
        int independiente=0;

        for(int x=0; x<grado; x++){
            System.out.println("Introduzca el valor "+(x+1)+" :");
            int valor = teclado.nextInt();
            
            if(x==grado-1){
                independiente = Math.abs(valor);
            }

            valores.add(valor);
        }

        for(int x=1; x<=independiente; x++){

            if(independiente%x == 0){
                multiplos.add(x);
                multiplos.add(-x);
            }
        }
        
        int resultado = Ruffini(multiplos, valores);

        if(Ruffini(multiplos, valores) == 0){
            return "La ecuación introducida no es exácta";
        }else{
            return ""+resultado;
        }
    }
}
