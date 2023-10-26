package ar.edu.unlu.poo.Vuelos;

public class Pasajero extends Persona{
    private int numeroPasajero;

    public Pasajero(String nombre,String telefono,String direccion,int numeroPasajero){
        super(nombre,telefono,direccion);
        this.numeroPasajero = numeroPasajero;
    }

    public int getNumeroPasajero() {
        return numeroPasajero;
    }
}
