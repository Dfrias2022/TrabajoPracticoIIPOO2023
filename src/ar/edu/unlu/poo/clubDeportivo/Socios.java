package ar.edu.unlu.poo.clubDeportivo;

import org.w3c.dom.ls.LSOutput;

public class Socios {
    private int nroSocio;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private int telefono;

    public Socios(int nroSocio,String nombre,String apellido,String email,String direccion, int telefono){
        this.nroSocio = nroSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
