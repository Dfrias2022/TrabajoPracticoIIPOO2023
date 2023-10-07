package ar.edu.unlu.poo.RentasAutos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String apellido;
    private String nombre;
    private String dni;
    private String telefono;
    private List<Alquiler> listaAlquileres;

    public Cliente(String apellido,String nombre,String dni,String telefono){
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        listaAlquileres = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
