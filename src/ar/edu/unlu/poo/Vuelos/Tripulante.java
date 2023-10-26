package ar.edu.unlu.poo.Vuelos;

public class Tripulante extends Persona{
    private String cargo;

    public Tripulante(String nombre,String telefono,String direccion,String cargo){
        super(nombre,telefono,direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
