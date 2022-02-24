package com.supergrupomolon.supercalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.supergrupomolon.supercalculadora.Classes.Poligono;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PoligonoTest {
    @Test
    @DisplayName("Poligono de 5 lados")
    void test5lados() {
        Poligono poligono5lados = new Poligono(5, 10);

        assertEquals(172.05, poligono5lados.area(),
                "El área de un polígono de 5 lados y 10cm por lado debe ser 172.05");
        assertEquals(50, poligono5lados.perimetro(),
                "El perímetro de un polígono de 5 lados y 10cm por lado debe ser de 50");
    }

    @Test
    @DisplayName("Poligono de 6 lados")
    void test6lados() {
        Poligono poligono6lados = new Poligono(6, 50);

        assertEquals(6495, 19, poligono6lados.area(),
                "El área de un polígono de 6 lados y 50cm por lado debe ser 172.05");
        assertEquals(300, poligono6lados.perimetro(),
                "El perímetro de un polígono de 6 lados y 50cm por lado debe ser de 50");
    }
}
