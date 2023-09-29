package ar.edu.unlu.poo.clubDeportivo;

public class Socio {
    private int nroSocio;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private int telefono;
    private Suscripcion suscripcion;

    public Socio(int nroSocio, String nombre, String apellido, String email, String direccion, int telefono, Suscripcion suscripcion){
        this.nroSocio = nroSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.suscripcion = suscripcion;
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

    public Suscripcion getSuscripcion(){
        return suscripcion;
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

    public void setSuscripcion(Suscripcion suscripcion){
        this.suscripcion = suscripcion;
    }
}
