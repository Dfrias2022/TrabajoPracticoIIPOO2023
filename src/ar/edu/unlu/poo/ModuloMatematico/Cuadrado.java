package ar.edu.unlu.poo.ModuloMatematico;

public class Cuadrado extends dosDimensiones{
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public Double getArea() {
        return lado * lado;
    }
}
