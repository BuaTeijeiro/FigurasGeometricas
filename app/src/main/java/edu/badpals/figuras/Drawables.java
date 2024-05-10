package edu.badpals.figuras;

import java.util.List;

public class Drawables {
    public static void dibujarDrawables(List<Drawable> figuras){
        for (Drawable figura : figuras){
            figura.draw();
        }
    }
}
