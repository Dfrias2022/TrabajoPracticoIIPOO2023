package ar.edu.unlu.poo.academiaDanza;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Asistencia> listaAsistencias;
    private List<Arancel> listaDeArancel;
    private Diagramacion diagramacion;

    public Inscripcion(Alumno alumno,Diagramacion diagramacion){
        this.alumno = alumno;
        this.listaAsistencias = new ArrayList<>();
        this.listaDeArancel = new ArrayList<>();
        this.diagramacion = diagramacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Asistencia> getListaAsistencias() {
        return listaAsistencias;
    }

    public void setListaAsistencias(List<Asistencia> listaAsistencias) {
        this.listaAsistencias = listaAsistencias;
    }

    public List<Arancel> getListaDeArancel() {
        return listaDeArancel;
    }

    public void setListaDeArancel(List<Arancel> listaDeArancel) {
        this.listaDeArancel = listaDeArancel;
    }

    public Diagramacion getDiagramacion() {
        return diagramacion;
    }

    public void setDiagramacion(Diagramacion diagramacion) {
        this.diagramacion = diagramacion;
    }
}
