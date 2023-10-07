package ar.edu.unlu.poo.RentasAutos;

public class Presupuesto {
    private double monto;
    private Vehiculo vehiculo;

    public Presupuesto(Vehiculo vehiculo){
        this.monto = vehiculo.calcularAlquiler();
    }
}
