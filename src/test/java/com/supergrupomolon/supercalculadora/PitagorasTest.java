package com.supergrupomolon.supercalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.supergrupomolon.supercalculadora.Classes.Pitagoras;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PitagorasTest {
    @Test
    @DisplayName("Calcular hipotenusa conociendo los catetos.")
    void testHipotenusa() {

        assertEquals(12.37, Pitagoras.calcularPitagoras(3, 12, 0),
                "En el caso de un tríangulo rectángulo en el que queremos saber la longitud de la hipotenusa, sabiendo que los catetos son de 3 y 12 la hipotenusa debe ser de 12,37.");

    }

    @Test
    @DisplayName("Calcular el cateto A conociendo el cateto B y la hipotenusa.")
    void testCatetoA() {

        assertEquals(3.61, Pitagoras.calcularPitagoras(0, 6, 7),
                "En el caso de un tríangulo rectángulo en el que queremos saber la longitud del cateto A, sabiendo que el cateto B es de 6 y la hipotenusa de 7 el cateto A debe ser de 3,61.");

    }

    @Test
    @DisplayName("Calcular el cateto B conociendo el cateto A y la hipotenusa.")
    void testCatetoB() {

        assertEquals(160.16, Pitagoras.calcularPitagoras(57, 0, 170),
                "En el caso de un tríangulo rectángulo en el que queremos saber la longitud del cateto B, sabiendo que el cateto A es de 57 y la hipotenusa de 170 el cateto B debe ser de 160,16.");

    }

}
