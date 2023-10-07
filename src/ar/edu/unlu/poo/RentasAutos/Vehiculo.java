package ar.edu.unlu.poo.RentasAutos;

public class Vehiculo {
    private int patente;
    protected double precio = 3000;
    protected int cantidadDias;

    public Vehiculo(int patente,int cantidadDias){
        this.patente = patente;
        this.cantidadDias = cantidadDias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public double calcularAlquiler(){
        return precio * cantidadDias;
    };

}
