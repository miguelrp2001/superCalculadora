package com.supergrupomolon.supercalculadora;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import com.supergrupomolon.supercalculadora.Classes.Ecuaciones;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EcuacionesTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPrimerGrado() {
        Ecuaciones ecuacion = new Ecuaciones();

        assertEquals(1, ecuacion.primerGrado(2, 2, 4));
    }

    @Test
    public void testSegundoGrado() {
        Ecuaciones ecuacion = new Ecuaciones();
        Double[] arrayGiven = { 1.0, 0.6666666666666666 };
        ArrayList<Double> list = ecuacion.segundoGrado(6, -10, 4);

        assertArrayEquals(arrayGiven, list.toArray());
    }
}