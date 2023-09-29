package ar.edu.unlu.poo.academiaDanza;

import java.time.LocalDateTime;
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
        Inscripcion i2 = new Inscripcion(a2,d1);
        Inscripcion i3 = new Inscripcion(a3,d1);
        listaDiagramaciones.add(d1);
        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);
        listaProfesores.add(p1);
        listaInscripciones.add(i1);
        listaInscripciones.add(i2);
        listaInscripciones.add(i3);
        Fecha f1 = new Fecha("viernes", "14:00");
        for (Diagramacion d:listaDiagramaciones) {
            d.agregarFecha(f1);
        }
        int total = 0;
        for (Inscripcion i:listaInscripciones) {
            if(p1.getNroProf() == i.getDiagramacion().getProfesor().getNroProf()) {
                total = total + 10;
            }
        }
        System.out.printf("el profesor %s gano %d",p1.getNombre(),total);
    }
}
