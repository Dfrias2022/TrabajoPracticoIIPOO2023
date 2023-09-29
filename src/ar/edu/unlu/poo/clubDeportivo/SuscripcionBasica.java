package ar.edu.unlu.poo.clubDeportivo;
import java.util.Set;
import java.util.EnumSet;
public class SuscripcionBasica extends Suscripcion{
    public SuscripcionBasica(Double cuota,String duracion){
        super(cuota,duracion,EnumSet.of(Actividad.FUTBOL,Actividad.BIBLIOTECA));
    }

    @Override
    public Set<Actividad> mostrarActividades() {
        return listaActividades;
    }
}
