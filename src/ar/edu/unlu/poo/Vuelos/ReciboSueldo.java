package ar.edu.unlu.poo.Vuelos;

import java.time.LocalDate;

public class ReciboSueldo {
    private Tripulante tripulante;
    private double sueldo;
    private LocalDate fecha;

    public ReciboSueldo(Tripulante tripulante, double sueldo, LocalDate fecha){
        this.tripulante = tripulante;
        this.sueldo = sueldo;
        this.fecha = fecha;
    }

    public Tripulante getTripulante() {
        return tripulante;
    }

    public void setTripulante(Tripulante tripulante) {
        this.tripulante = tripulante;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
