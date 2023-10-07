package ar.edu.unlu.poo.RentasAutos;

public class CamionCarga extends Vehiculo{
    public CamionCarga(int patente, int cantidadDias) {
        super(patente, cantidadDias);
    }
    @Override
    public double calcularAlquiler(){
        if(super.getCantidadDias() > 30){
            return 7500 * super.getCantidadDias();
        }else{
            return 100000.00;
        }
    };
}
