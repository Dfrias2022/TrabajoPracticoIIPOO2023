package ar.edu.unlu.poo.LibroMejorado;
import java.util.ArrayList;
import java.util.List;
public class Socio {
    private int idSocio;
    private String apellido;
    private String nombre;
    private String dni;
    private String telefono;
    private List<Libro> librosSolicitados;

    public Socio(int idSocio,String apellido,String nombre, String dni ,String telefono){
        this.idSocio = idSocio;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        librosSolicitados = new ArrayList<>();
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
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

    public List<Libro> getLibrosSolicitados() {
        return librosSolicitados;
    }

    public void setLibrosSolicitados(List<Libro> librosSolicitados) {
        this.librosSolicitados = librosSolicitados;
    }
}
