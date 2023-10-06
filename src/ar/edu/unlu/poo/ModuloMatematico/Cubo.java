package ar.edu.unlu.poo.ModuloMatematico;

public class Cubo extends tresDimensiones{
    private double arista;

    public Cubo(double arista){
        this.arista = arista;
    }

    @Override
    public Double getArea() {
        return 6 * Math.pow(arista,2);
    }

    @Override
    public Double getVolumen() {
        return Math.pow(arista,3);
    }
}
