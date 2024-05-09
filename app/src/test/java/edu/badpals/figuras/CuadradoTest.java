package edu.badpals.figuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {
    @Test
    public void test_getName(){
        Cuadrado cuadradoDesconocido = new Cuadrado(4);
        Cuadrado cuadrado = new Cuadrado("cuadradoGrande",8);
        assertEquals("cuadrado",cuadradoDesconocido.getNombre());
        assertEquals("cuadradoGrande",cuadrado.getNombre());
    }
    @Test
    public void test_getArea(){
        Cuadrado cuadradoDesconocido = new Cuadrado(4);
        Cuadrado cuadrado = new Cuadrado("cuadradoGrande",8);
        assertEquals(16,cuadradoDesconocido.getArea());
        assertEquals(64,cuadrado.getArea());
    }

    @Test
    public void test_herencia() {
        FiguraGeometrica cuadradoDesconocido = new Cuadrado(4);
        FiguraGeometrica cuadrado = new Cuadrado("cuadradoGrande", 8);
        assertEquals(16, cuadradoDesconocido.getArea());
        assertEquals(64, cuadrado.getArea());
    }

}