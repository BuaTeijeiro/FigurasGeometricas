package edu.badpals.figuras;

public class Elipse extends FiguraGeometrica implements Drawable{
    private double semiejeMayor;
    private double semiejeMenor;

    private static final double PI = Math.PI;

    public Elipse(double semiejeMayor, double semiejeMenor){
        super("Elipse");
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
        computeArea();
    }

    public Elipse(String nombre, double semiejeMayor, double semiejeMenor){
        super(nombre);
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
        computeArea();
    }

    public double getSemiejeMayor() {
        return semiejeMayor;
    }

    public double getSemiejeMenor() {
        return semiejeMenor;
    }

    @Override
    public void computeArea() {
        double area = getSemiejeMayor() * getSemiejeMenor() * Elipse.PI;
        setArea(area);
    }

    @Override
    public void draw() {
        System.out.println("Soy una elipse dibujada");
    }
}
