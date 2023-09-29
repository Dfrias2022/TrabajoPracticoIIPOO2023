package ar.edu.unlu.poo.academiaDanza;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    public static void main(String[] args) {
        List<Diagramacion> listaDiagramaciones = new ArrayList<>();
        List<Alumno> listaAlumnos = new ArrayList<>();
        List<Inscripcion> listaInscripciones = new ArrayList<>();
        List<Profesor> listaProfesores = new ArrayList<>();

        Alumno a1 = new Alumno(125940,"frias","ariel",234556);
        Alumno a2 = new Alumno(125940,"frias","diego",234556);
        Alumno a3 = new Alumno(125940,"frias","juan",234556);
        Profesor p1 = new Profesor(1,"areli","jsoe",1234);
        Diagramacion d1 = new Diagramacion(Nivel.INICIAL,Disciplina.CLAICO,p1);
        Inscripcion i1 = new Inscripcion(a1,d1);
        listaDiagramaciones.add(d1);
        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);
        listaProfesores.add(p1);
        listaInscripciones.add(i1);
    }
}
