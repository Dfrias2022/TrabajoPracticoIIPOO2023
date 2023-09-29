package ar.edu.unlu.poo.clubDeportivo;
import java.util.Set;
public abstract class Suscripcion {
    protected double cuota;
    protected String duracion;
    protected Set<Actividad> listaActividades;

    public Suscripcion(double cuota, String duracion, Set<Actividad> listaActividades){
        this.cuota = cuota;
        this.duracion = duracion;
        this.listaActividades = listaActividades;
    }

    public double getCuota() {
        return cuota;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public abstract Set<Actividad> mostrarActividades();
}
