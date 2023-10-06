package ar.edu.unlu.poo.Empresa;

public class EmpleadoFullTime extends Empleado{
    private double salarioFijo;

    public EmpleadoFullTime(String apellido, String nombre, String cuit, String telefono, double salarioFijo,int dia,int mes) {
        super(apellido, nombre, cuit, telefono,dia,mes);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSueldo() {
        return salarioFijo;
    }
    @Override
    public Double bonoCumple(){
        return super.getBonoC() + 1000.00;
    }
}
