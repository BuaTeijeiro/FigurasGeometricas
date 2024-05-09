package edu.badpals.figuras;

public abstract class FiguraGeometrica {

    private String nombre;
    private double area;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public FiguraGeometrica() {
        this.nombre = "No sé como me llamo";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    void setArea(double area) {
        this.area = area;
    }

    public abstract double computeArea();

    
}
