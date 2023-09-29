package ar.edu.unlu.poo.clubDeportivo;
import java.util.Set;
import java.util.EnumSet;
public class SuscripcionDestacada extends  Suscripcion{

    public SuscripcionDestacada(double cuota,String duracion){
        super(cuota,duracion,EnumSet.range(Actividad.FUTBOL,Actividad.COMEDOR));
    }
    @Override
    public Set<Actividad> mostrarActividades() {
        return listaActividades;
    }
}
