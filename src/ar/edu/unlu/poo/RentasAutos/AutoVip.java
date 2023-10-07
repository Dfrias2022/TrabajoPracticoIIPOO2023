package ar.edu.unlu.poo.RentasAutos;

public class AutoVip extends AutoPasajero{
    public AutoVip(int patente, int cantidadDias, int cantidadAsientos) {
        super(patente, cantidadDias, cantidadAsientos);
    }

    @Override
    public double calcularAlquiler(){
        super.setPrecioAsiento(500);
        return super.calcularAlquiler();
    };
}
