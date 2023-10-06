package ar.edu.unlu.poo.ModuloMatematico;

public class Triangulo extends dosDimensiones{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public Double getArea() {
        return (base * altura) / 2;
    }
}
