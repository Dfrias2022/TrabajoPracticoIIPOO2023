package ar.edu.unlu.poo.billeteras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    private final String formato1 = "dd-MM-yyyy";
    private final String formato2 = "MM-dd-yyyy";
    private DateTimeFormatter formaterFormato1 = DateTimeFormatter.ofPattern(formato1);
    private DateTimeFormatter formaterFormato2 = DateTimeFormatter.ofPattern(formato1);

    public DateUtils(){

    }
    public LocalDate getFechaDesdeFormato(String fecha, String formato){
        LocalDate algo = LocalDate.now();
        return algo;
    }
    public Boolean esMayor(LocalDate a, LocalDate b){
        return true;
    }
    public Boolean esMenor(LocalDate a, LocalDate b){
        return false;
    }
    public Boolean estaEntreFechas (LocalDate aComparar, LocalDate miniRango,LocalDate maxRango){
        return true;
    }
}
