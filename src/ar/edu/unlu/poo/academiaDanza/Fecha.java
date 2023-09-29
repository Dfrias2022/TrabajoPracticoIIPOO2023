package ar.edu.unlu.poo.academiaDanza;

import java.util.Date;

public class Fecha {
    private String dia;
    private Date horario;

    public Fecha(String dia,Date horario){
        this.dia = dia;
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
}
