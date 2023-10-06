package ar.edu.unlu.poo.ModuloMatematico;

public class Esfera extends tresDimensiones{
    private final double PI = 3.1415;
    private double radio;

    public Esfera(double radio){
        this.radio = radio;
    }

    @Override
    public Double getArea() {
        return 4 * PI * Math.pow(radio,3);
    }

    @Override
    public Double getVolumen() {
        return ((4/3) * PI * Math.pow(radio,3));
    }
}
