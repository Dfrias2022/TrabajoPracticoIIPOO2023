package ar.edu.unlu.poo.academiaDanza;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private int dni;


    public Alumno(int legajo,String apellido,String nombre,int dni){
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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
