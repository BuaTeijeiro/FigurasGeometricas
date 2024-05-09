package edu.badpals.figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElipseTest {
        @Test
    void constructorTest(){
        Elipse elipse1 = new Elipse(3, 2);
        Elipse elipse2 = new Elipse("Elipse", 2.5, 3.1);

        assertEquals("Elipse", elipse1.getNombre());
        assertEquals("Elipse", elipse2.getNombre());
        assertEquals(3, elipse1.getSemiejeMayor());
        assertEquals(2, elipse1.getSemiejeMenor());
        assertEquals(2.5, elipse2.getSemiejeMayor(),0);
        assertEquals(3.1, elipse2.getSemiejeMenor(),0);
    }

    @Test
    void computeAreaTest(){
        Elipse elipse1 = new Elipse(3, 2);
        Elipse elipse2 = new Elipse("Elipse", 2.5, 3.1);
        assertEquals(3 * 2 * Math.PI, elipse1.getArea(), 0.1);
        assertEquals(2.5 * 3.1 * Math.PI, elipse2.getArea(), 0.1);
    }

    @Test
    void herenciaTest(){
        FiguraGeometrica elipse1 = new Elipse(3, 2);
        FiguraGeometrica elipse2 = new Elipse("Elipse", 2.5, 3.1);
        assertEquals(3 * 2 * Math.PI, elipse1.getArea(), 0.1);
        assertEquals(2.5 * 3.1 * Math.PI, elipse2.getArea(), 0.1);
    }

}
