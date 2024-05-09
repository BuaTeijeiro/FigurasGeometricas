package edu.badpals.figuras;

public class Rectangulo extends FiguraGeometrica{
    double base;
    double altura;

    public Rectangulo(double base, double altura){
        super("rectángulo");
        this.base = base;
        this.altura = altura;
        computeArea();
    }

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
        computeArea();
    }

    @Override
    public void computeArea() {
        Double area = base  * altura;
        setArea(area);
    }
}
