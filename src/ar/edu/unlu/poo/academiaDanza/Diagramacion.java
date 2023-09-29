package ar.edu.unlu.poo.academiaDanza;

import java.util.ArrayList;
import java.util.List;

public class Diagramacion {
    private List<Fecha> diaHora;
    private Nivel nivel;
    private Disciplina disciplina;
    private Profesor profesor;

    public Diagramacion(Nivel nivel,Disciplina disciplina, Profesor profesor){
        this.diaHora = new ArrayList<>();
        this.nivel = nivel;
        this.disciplina =disciplina;
        this.profesor = profesor;

    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
