package ar.edu.unlu.poo.RentasAutos;

import ar.edu.unlu.poo.Empresa.Pasante;

public class CamionetaFlete extends Vehiculo{
    private  int PAT;
    private final double valorFijo = 600.00;

    public CamionetaFlete(int patente, int cantidadDias,int PAT) {
        super(patente, cantidadDias);
        this.PAT = PAT;
    }

    @Override
    public double calcularAlquiler(){
        return super.calcularAlquiler() + (valorFijo * PAT);
    };

}
