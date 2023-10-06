package ar.edu.unlu.poo.ModuloMatematico;

public class Circulo extends dosDimensiones{
    private final double PI = 3.1415;
    private Double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public Double getArea() {
        return PI * Math.pow(radio, 2);
    }
}
