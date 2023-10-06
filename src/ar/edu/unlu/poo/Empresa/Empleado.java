package ar.edu.unlu.poo.Empresa;
import java.time.LocalDate;
import java.time.MonthDay;

public abstract class Empleado {
    private String apellido;
    private String nombre;
    private String cuit;
    private String telefono;
    private MonthDay cumpleaños;
    private double bonoC;

    public Empleado(String apellido,String nombre,String cuit,String telefono,int dia,int mes){
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
        this.telefono = telefono;
        this.cumpleaños = MonthDay.of(mes,dia);
    }
    public abstract double calcularSueldo();

    public boolean esCumpleaños(){
        LocalDate fechaActual = LocalDate.now();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();
        MonthDay fecha = MonthDay.of(mesActual,diaActual);
        return fecha == cumpleaños;
    }
    public Double bonoCumple(){
        return bonoC;
    }

    public double getBonoC() {
        return bonoC;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
