package ar.edu.unlu.poo.academiaDanza;

public class Profesor {
    private int nroProf;
    private String apellido;
    private String nombre;
    private int dni;


    public Profesor(int nroProf,String apellido, String nombre,int dni){
        this.nroProf = nroProf;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getNroProf() {
        return nroProf;
    }

    public void setNroProf(int nroProf) {
        this.nroProf = nroProf;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
