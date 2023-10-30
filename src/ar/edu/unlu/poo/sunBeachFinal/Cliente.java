package ar.edu.unlu.poo.sunBeachFinal;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String apellido;
    private String nombre;
    private String dni;
    private String telefono;
    private List<PaqueteTuristico> listaPaquetes;

    public Cliente(int idCliente, String apellido,String nombre,String dni,String telefono){
        this.idCliente = idCliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.listaPaquetes = new ArrayList<>();
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
    
    public void agregarNuevoPaquete(PaqueteTuristico paquete){
        listaPaquetes.add(paquete);
    }

    public List<PaqueteTuristico> getListaPaquetes() {
        return listaPaquetes;
    }
}
