package ar.edu.unlu.poo.academiaDanza;

import java.util.Date;

public class Fecha {
    private String dia;
    private String horario;

    public Fecha(String dia, String horario){
        this.dia = dia;
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
