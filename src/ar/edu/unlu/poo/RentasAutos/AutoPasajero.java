package ar.edu.unlu.poo.RentasAutos;

public class AutoPasajero extends Vehiculo{
    private int cantidadAsientos;
    protected double precioAsiento = 300.00;

    public AutoPasajero(int patente, int cantidadDias,int cantidadAsientos) {
        super(patente, cantidadDias);
        this.cantidadAsientos = cantidadAsientos;
    }

    public void setPrecioAsiento(double precioAsiento) {
        this.precioAsiento = precioAsiento;
    }

    @Override
    public double calcularAlquiler(){
        return super.calcularAlquiler() + (precioAsiento * cantidadAsientos);
    };
}
