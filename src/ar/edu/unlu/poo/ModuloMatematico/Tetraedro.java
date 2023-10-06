package ar.edu.unlu.poo.ModuloMatematico;

public class Tetraedro extends tresDimensiones{
    private double arista;

    public Tetraedro(double arista){
        this.arista = arista;
    }

    @Override
    public Double getArea() {
        return Math.pow(arista,2) * Math.sqrt(3);
    }

    @Override
    public Double getVolumen() {
        return Math.pow(arista,3) * (Math.sqrt(2)/12);
    }
}
