package ar.edu.unlu.poo.Empresa;

public class EmpleadoPorHora extends Empleado{
    private double sumaFija;
    private int cantidadHoras;

    public EmpleadoPorHora(String apellido, String nombre, String cuit, String telefono, double sumaFija,int cantidadHoras,int dia,int mes) {
        super(apellido, nombre, cuit, telefono,dia,mes);
        this.sumaFija = sumaFija;
        this.cantidadHoras = cantidadHoras;
    }

    @Override
    public double calcularSueldo() {
        if(cantidadHoras <= 40){
            return sumaFija * cantidadHoras;
        }else{
            return (sumaFija * cantidadHoras)* 1.20;    //agrego el 20 porciento si trabajo mas de 40 horas
        }

    }
}
