package ar.edu.unlu.poo.RentasAutos;

public class Alquiler {
    private Cliente cliente;
    private  Presupuesto presupuesto;

    public Alquiler(Cliente cliente, Presupuesto presupuesto){
        this.cliente = cliente;
        this.presupuesto = presupuesto;
    }
}
