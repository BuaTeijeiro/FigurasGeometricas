package edu.badpals.figuras;

public class Cuadrado extends FiguraGeometrica{
    double lado;

    public Cuadrado(double lado) {
        super("cuadrado");
        this.lado = lado;
        computeArea();
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
        computeArea();
    }

    @Override
    public void computeArea() {
        double area = lado * lado;
        setArea(area);
    }
}
