package ar.edu.unlu.poo.Vuelos;

public class Pasajero  implements Rol{
    private int numeroPasajero;

    public Pasajero(int numeroPasajero){
      //  super(nombre,telefono,direccion);
        this.numeroPasajero = numeroPasajero;
    }

    public int getNumeroPasajero() {
        return numeroPasajero;
    }

    @Override
    public String obtenerRolPersona() {
        return "pasajero";
    }
}
