package ar.edu.unlu.poo.academiaDanza;

public class Salon {
    private int nro;
    private String lugar;
    private double costo;

    public Salon(int nro,String lugar,Double costo){
        this.nro = nro;
        this.lugar = lugar;
        this.costo = costo;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
