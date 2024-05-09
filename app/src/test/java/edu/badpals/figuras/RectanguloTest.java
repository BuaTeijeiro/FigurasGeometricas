package edu.badpals.figuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {
    @Test
    public void test_getName(){
        Rectangulo rectanguloDesconocido = new Rectangulo(4,5);
        Rectangulo rectangulo = new Rectangulo("rectánguloGrande",8,10);
        assertEquals("rectángulo",rectanguloDesconocido.getNombre());
        assertEquals("rectánguloGrande",rectangulo.getNombre());
    }
    @Test
    public void test_getArea(){
        Rectangulo rectanguloDesconocido = new Rectangulo(4,5);
        Rectangulo rectangulo = new Rectangulo("rectánguloGrande",8,10);
        assertEquals(20,rectanguloDesconocido.getArea());
        assertEquals(80,rectangulo.getArea());
    }




}