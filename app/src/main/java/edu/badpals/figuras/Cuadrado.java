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
        double area = getLado() * getLado();
        setArea(area);
    }

    private double getLado(){
        return this.lado;
    }
}
