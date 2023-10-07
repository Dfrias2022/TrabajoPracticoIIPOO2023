package ar.edu.unlu.poo.RentasAutos;

public class Combi extends Vehiculo{
    public Combi(int patente, int cantidadDias) {
        super(patente, cantidadDias);
    }
    @Override
    public double calcularAlquiler(){
        super.setPrecio(4500.00);
        return precio * super.getCantidadDias();
    };
}
