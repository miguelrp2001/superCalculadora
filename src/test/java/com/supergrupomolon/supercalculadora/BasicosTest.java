package com.supergrupomolon.supercalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.supergrupomolon.supercalculadora.Classes.Basicas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BasicosTest {
     static Basicas  cuentasBasicas;

    @BeforeAll
    public static void beforeClass() {
        cuentasBasicas = new Basicas();
    }

    @Test
    public void testSuma() {
        double actual = cuentasBasicas.suma(6, 2);
        double expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void testResta() {
        double actual = cuentasBasicas.resta(6, 2);
        double expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplicacion() {
        double actual = cuentasBasicas.multiplicacion(6, 2);
        double expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        double actual = cuentasBasicas.divison(6, 2);
        double expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testLogaritmo() {
        double actual = Math.round(cuentasBasicas.logaritmo(6));
        double expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testRaiz() {
        double actual = cuentasBasicas.raiz(4);
        double expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testPotencia() {
        double actual = cuentasBasicas.potencia(4, 2);
        double expected = 16;
        assertEquals(expected, actual);
    }

}
