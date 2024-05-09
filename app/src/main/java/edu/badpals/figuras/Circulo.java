package edu.badpals.figuras;

public class Circulo extends FiguraGeometrica{
    private double radio;
    private static final double PI = Math.PI;

    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
        computeArea();
    }

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
        computeArea();
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void computeArea() {
        double area = Math.pow(this.getRadio(), 2) * Circulo.PI;
        setArea(area);
    }

    

}
