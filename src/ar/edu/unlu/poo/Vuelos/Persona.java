package ar.edu.unlu.poo.Vuelos;

public class Persona {
    private String nombre;
    private String telefono;
    private String direcccion;

    public Persona(String nombre,String telefono,String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direcccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }
}

