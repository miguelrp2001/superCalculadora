package com.supergrupomolon.supercalculadora;
import com.supergrupomolon.supercalculadora.Classes.Ecuaciones;


public class App 
{
    public static void main( String[] args )
    {
        Ecuaciones ecuation = new Ecuaciones();

        System.out.println(ecuation.ecuacionesSuperiores(4));
    }
}
