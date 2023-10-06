package ar.edu.unlu.poo.ModuloMatematico;

public class Rectangulo extends dosDimensiones{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return base * altura;
    }
}
