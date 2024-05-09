package edu.badpals.figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CirculoTest {
    @Test
    void constructorTest(){
        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = new Circulo("Circulo", 2.5);

        assertEquals("Circulo", circulo1.getNombre());
        assertEquals("Circulo", circulo2.getNombre());
        assertEquals(3, circulo1.getRadio());
        assertEquals(2.5, circulo2.getRadio(),0);
    }

    @Test
    void computeArea(){
        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = new Circulo("Circulo", 2.5);
        assertEquals(9 * Math.PI, circulo1.getArea(), 0.1);
        assertEquals(2.5 * 2.5 * Math.PI, circulo2.getArea(), 0.1);
    }
}
