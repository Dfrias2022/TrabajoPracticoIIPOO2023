package ar.edu.unlu.poo.clubDeportivo;
import java.util.Set;
import java.util.EnumSet;
public class SuscripcionIntermedia extends Suscripcion{

    public SuscripcionIntermedia(double cuota, String duracion) {
        super(cuota, duracion,EnumSet.range(Actividad.FUTBOL,Actividad.PISCINA));
    }

    @Override
    public Set<Actividad> mostrarActividades() {
        return listaActividades;
    }
}
