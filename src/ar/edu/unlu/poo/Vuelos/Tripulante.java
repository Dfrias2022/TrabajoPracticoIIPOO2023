package ar.edu.unlu.poo.Vuelos;

public class Tripulante implements Rol{
    private String cargo;

    public Tripulante(String cargo){
       // super(nombre,telefono,direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String obtenerRolPersona() {
        return "Tripulante - cargo " + cargo;
    }
}
